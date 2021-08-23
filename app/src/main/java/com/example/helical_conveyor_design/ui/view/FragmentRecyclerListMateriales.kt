package com.example.helical_conveyor_design.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helical_conveyor_design.Adapters.MaterialesRecyclerViewAdapter
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.data.model.RecyclerList
import com.example.helical_conveyor_design.ui.viewmodel.MaterialViewModel


class FragmentRecyclerListMateriales : Fragment() {

    private lateinit var recyclerAdapter :  MaterialesRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_recycler_list_materiales, container, false)

        initViewModel(view)
        initViewModel()

        return view
    }

    private fun initViewModel(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview_materiales)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val decortion = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(decortion)

        recyclerAdapter = MaterialesRecyclerViewAdapter()
        recyclerView.adapter = recyclerAdapter
    }

    private fun initViewModel(){
        val viewModel = ViewModelProvider(this).get(MaterialViewModel::class.java)
        viewModel.getRecyclerListObserver().observe(this, Observer<RecyclerList> {
            if (it!=null){
                recyclerAdapter.setUpdateData(it.materiales)
            }else{
                Toast.makeText(activity, "Error in gettin data", Toast.LENGTH_SHORT).show()
            }
        })
        viewModel.makeApiCall()
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            FragmentRecyclerListMateriales()
        }
}