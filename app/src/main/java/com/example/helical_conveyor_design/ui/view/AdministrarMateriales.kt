package com.example.helical_conveyor_design.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.helical_conveyor_design.databinding.ActivityAdministrarMaterialesBinding
import com.example.helical_conveyor_design.ui.viewmodel.MaterialViewModel

class AdministrarMateriales : AppCompatActivity() {

    private lateinit var binding: ActivityAdministrarMaterialesBinding

    private val materialViewModel: MaterialViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdministrarMaterialesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupFragment()

    }

    private fun setupFragment() {
        val fragment = FragmentRecyclerListMateriales.newInstance()
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(android.R.id.content, fragment)
        fragmentTransaction.commit()
    }


}