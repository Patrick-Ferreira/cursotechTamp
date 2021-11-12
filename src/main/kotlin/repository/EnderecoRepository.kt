package repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import model.Endereco

@Repository
interface EnderecoRepository:JpaRepository<Endereco, Long> {
}