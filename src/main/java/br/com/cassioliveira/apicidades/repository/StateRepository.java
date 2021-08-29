package br.com.cassioliveira.apicidades.repository;

import br.com.cassioliveira.apicidades.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
