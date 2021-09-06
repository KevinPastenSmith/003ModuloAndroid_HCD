package com.example.helical_conveyor_design.Adapters.motores

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.data.config.motor.ConstantesMotor
import com.example.helical_conveyor_design.data.model.motor.MotorModel
import com.example.helical_conveyor_design.databinding.ItemListMotorBinding
import com.example.helical_conveyor_design.ui.view.nuevo.NuevoMotorActivity


class MotoresAdapter (private val dataSet: List<MotorModel>?) :
    RecyclerView.Adapter<MotoresAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_list_motor, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val item = dataSet?.get(position)
        viewHolder.enlazarItem(item!!)
    }

    override fun getItemCount() = dataSet!!.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var binding = ItemListMotorBinding.bind(view)
        var contexto = view.context

        fun enlazarItem(motor: MotorModel) {
            binding.tvIdMotor.text = motor.idMotor.toString()
            binding.tvNombreMotor.text = motor.nombreMotor
            binding.tvSentidoGiroMotor.text = motor.sentidoGiroMotor
            binding.tvPosicionMotor.text = motor.posicionMotor

            binding.root.setOnClickListener {
                val intent = Intent(contexto, NuevoMotorActivity::class.java)
                intent.putExtra(ConstantesMotor.OPERACION_KEY, ConstantesMotor.OPERACION_EDITAR)
                intent.putExtra(ConstantesMotor.ID_MOTOR_KEY, motor.idMotor)
                contexto.startActivity(intent)
            }


        }

    }

}

