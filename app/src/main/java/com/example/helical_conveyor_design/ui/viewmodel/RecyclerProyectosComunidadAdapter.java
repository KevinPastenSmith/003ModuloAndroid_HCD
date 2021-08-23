package com.example.helical_conveyor_design.ui.viewmodel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.helical_conveyor_design.R;
import com.example.helical_conveyor_design.data.model.RecyclerProyectosComunidad;

import java.util.List;

public class RecyclerProyectosComunidadAdapter extends RecyclerView.Adapter<RecyclerProyectosComunidadAdapter.ViewHolder> {

    private List<RecyclerProyectosComunidad> mData;
    private LayoutInflater mInflater;
    private Context context;
    final RecyclerProyectosComunidadAdapter.OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(RecyclerProyectosComunidad item);
    }

    public RecyclerProyectosComunidadAdapter (List<RecyclerProyectosComunidad> itemList, Context context, RecyclerProyectosComunidadAdapter.OnItemClickListener listener){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
        this.listener = listener;
    }

    @Override
    public int getItemCount() {return mData.size(); }

    @Override
    public RecyclerProyectosComunidadAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.recycler_proyectoscomunidad, null);
        return new RecyclerProyectosComunidadAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerProyectosComunidadAdapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<RecyclerProyectosComunidad> items){mData=items;}


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView nombreProyecto, mailUsuario;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = (ImageView) itemView.findViewById(R.id.iv_cardviewrecycler);
            nombreProyecto = (TextView) itemView.findViewById(R.id.tv_nombreproyecto);
            mailUsuario = (TextView) itemView.findViewById(R.id.tv_mailusuario);
        }

        void bindData(final RecyclerProyectosComunidad item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()),PorterDuff.Mode.SRC_IN);
            nombreProyecto.setText(item.getNombreProyecto());
            mailUsuario.setText(item.getMailUsuario());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }

   

    }
}
