package model

import javax.persistence.*

@Entity
data class Pessoa (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?,
    val name:String,
    val email:String,
    @OneToOne
    var endereco:Endereco
)