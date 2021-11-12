package controller

import controller.util.GetEndereco
import io.micronaut.http.annotation.*
import model.Endereco
import model.Pessoa
import repository.EnderecoRepository
import repository.PessoaRepository

@Controller("/api/v1/pessoas")
class PessoaController(
    private val pessoaRepository: PessoaRepository,
    private val enderecoRepository: EnderecoRepository,
    private val getEndereco: GetEndereco
) {


    @Get
    fun buscarLista(): List<Pessoa> {

        return pessoaRepository.findAll()
    }

    @Get("/{cep}")
    fun buscarEndereco(@PathVariable cep:String) = getEndereco.buscarViaCep(cep)

    @Post("/{cep}")
    fun salvarEndereco(@PathVariable cep: String):Endereco {

        val endereco = getEndereco.buscarViaCep(cep)
       return enderecoRepository.save(endereco)
    }

    @Post("/cadastro/{cep}")
    fun salvarPessoa(@Body pessoa: Pessoa, @PathVariable cep: String):Pessoa{

        val endereco = getEndereco.buscarViaCep(cep)
        enderecoRepository.save(endereco)
        pessoa.endereco = endereco
        return pessoaRepository.save(pessoa)
    }


}
