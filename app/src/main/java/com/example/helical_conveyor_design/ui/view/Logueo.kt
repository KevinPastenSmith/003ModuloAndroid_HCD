package com.example.helical_conveyor_design.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.databinding.ActivityLogueoBinding
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_crearcuenta.*

enum class ProviderType {
    BASIC
}


class Logueo : AppCompatActivity() {

    private lateinit var binding: ActivityLogueoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.SplashTheme)
        super.onCreate(savedInstanceState)

        binding = ActivityLogueoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Analytic event
        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message","Integracion de Firebase completa")
        analytics.logEvent("InitScreen", bundle)

        ingresar()

    }

    //Metodo Registrar
    private fun ingresar() {

        title = "Autenticación"

        with (binding) {
            btnLogueoInvitado.setOnClickListener {
                val invitado = Intent(this@Logueo, Invitado::class.java)
                startActivity(invitado)
            }

            btnLogueoCrearcuenta.setOnClickListener {
                val crearCuenta = Intent(this@Logueo, CrearCuenta::class.java)
                startActivity(crearCuenta)
            }

            btnLogueoIngresar.setOnClickListener {
                if (etLogueoMail.text.isNotEmpty() &&
                    etLogueoPassword.text.isNotEmpty()) {

                    val homeIntent = Intent(this@Logueo, Inicio::class.java)
                    startActivity(homeIntent)
                }

            }
        }

    }

    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("se ha producido un error en la autenticacion al usuario")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showHome (mail: String, provider: ProviderType){
        val homeIntent = Intent(this@Logueo, Inicio::class.java)
        startActivity(homeIntent)
    }

}