package com.example.helical_conveyor_design.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helical_conveyor_design.Adapters.MaterialesAdapter
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.data.network.MaterialRepository
import com.example.helical_conveyor_design.data.network.MaterialesApi
import com.example.helical_conveyor_design.ui.viewmodel.MaterialesViewModel
import com.example.helical_conveyor_design.ui.viewmodel.MaterialesViewModelFactory
import kotlinx.android.synthetic.main.materiales_fragment.*

class MaterialesFragment : Fragment() {


    private lateinit var factory: MaterialesViewModelFactory
    private lateinit var viewModel: MaterialesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.materiales_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val api = MaterialesApi()
        val repository = MaterialRepository(api)
        factory = MaterialesViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(MaterialesViewModel::class.java)
        viewModel.getMateriales()
        viewModel.materiales.observe(viewLifecycleOwner, Observer {materiales ->
            recycler_view_materiales.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = MaterialesAdapter(materiales)
            }

        })
    }


}