package controller.util

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import model.Endereco

@Client("https://viacep.com.br/ws")
interface GetEndereco {

    @Get("/{cep}/json")
    fun buscarViaCep (cep:String):Endereco
}