package br.com.cassioliveira.apicidades.service;

import br.com.cassioliveira.apicidades.model.State;
import br.com.cassioliveira.apicidades.repository.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StateService {

    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public Page<State> states(Pageable page){
       return stateRepository.findAll(page);
    }

    public Optional<State> getOne(Long id){
        return stateRepository.findById(id);
    }

}
