package br.com.marianno.bootcamp.nossobancodigital.repository;

import br.com.marianno.bootcamp.nossobancodigital.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
