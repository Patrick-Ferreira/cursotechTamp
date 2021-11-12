package model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Endereco (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?,
    val cep:String,
    val logradouro:String,
    val complemento:String,
    val bairro:String,
    val localidade:String,
    val uf:String,
)
