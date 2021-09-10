package com.example.helical_conveyor_design.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityCrearcuentaBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_crearcuenta.*

class CrearCuenta : AppCompatActivity() {

    private lateinit var binding: ActivityCrearcuentaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearcuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registrarCuenta()
    }

    //Metodo Registrar
    private fun registrarCuenta() {

        title = "Registro"

        binding.btnCrearcuentaRegistrar.setOnClickListener {
            if (et_crearcuenta_mail.text.isNotEmpty() &&
                et_crearcuenta_password.text.isNotEmpty() &&
                et_crearcuenta_password2.text.isNotEmpty() &&
                et_crearCuenta_nickUsuario.text.isNotEmpty())

                    FirebaseAuth.getInstance()
                        .createUserWithEmailAndPassword(
                            et_crearcuenta_mail.text.toString(),
                            et_crearcuenta_password.toString()
                        ).addOnCompleteListener {
                            if (it.isSuccessful){
                                showHome(it.result?.user?.email?: "", ProviderType.BASIC)
                            }else{
                                showAlert()
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
        val homeIntent = Intent(this, Logueo::class.java).apply {
            putExtra("mail",mail)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)
    }
}