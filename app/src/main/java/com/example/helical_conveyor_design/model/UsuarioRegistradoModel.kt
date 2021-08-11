package com.example.helical_conveyor_design.model

class UsuarioRegistradoModel {

    //Atributos
    private var idUsuario : String? = null
    private var nickName : String? = null
    private var password : String? = null
    private var mail : String? = null
    private var profesionOficio : String? = null

    //Connstructores
    constructor() : super() {}

    constructor(
        id_usuario: String?,
        nickName: String?,
        password: String?,
        mail: String?,
        profesionOficio: String?
    ) : super() {
        this.idUsuario = id_usuario
        this.nickName = nickName
        this.password = password
        this.mail = mail
        this.profesionOficio = profesionOficio
    }

}