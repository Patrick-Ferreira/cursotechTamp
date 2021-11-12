package repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import model.Pessoa

@Repository
interface PessoaRepository:JpaRepository<Pessoa, Long> {
}