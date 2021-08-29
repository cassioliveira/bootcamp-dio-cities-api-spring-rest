package br.com.cassioliveira.apicidades.repository;

import br.com.cassioliveira.apicidades.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
