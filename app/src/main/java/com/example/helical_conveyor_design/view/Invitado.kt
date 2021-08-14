package com.example.helical_conveyor_design.view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.databinding.ActivityInvitadoBinding

class Invitado : AppCompatActivity() {

    private var fragmentInvitadoNuevo: FragmentNuevo? = FragmentNuevo()
    private var fragmentInvitadoAdministrarproyectactual: FragmentAdministrarProyectoActual? = FragmentAdministrarProyectoActual()

    private lateinit var binding:ActivityInvitadoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvitadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.framelayout_invitado, fragmentInvitadoNuevo!!).commit()

        binding.btnInvitadoNuevo.setOnClickListener {
            fragmentNuevoTransaction()
        }
        binding.btnInvitadoAdminproyectactual.setOnClickListener {
            fragmentInvitadoAdministrarproyectactualTransaction()
        }

    }

    private fun fragmentInvitadoAdministrarproyectactualTransaction() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout_invitado, fragmentInvitadoAdministrarproyectactual!!).commit()
    }

    private fun fragmentNuevoTransaction() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout_invitado, fragmentInvitadoNuevo!!).commit()
    }

}