package br.com.cassioliveira.apicidades.resources;

import br.com.cassioliveira.apicidades.model.State;
import br.com.cassioliveira.apicidades.service.StateService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/states")
public class StateResource {

    private StateService stateService;

    public StateResource(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping
    public Page<State> states(Pageable page){
        return stateService.states(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<State> state = stateService.getOne(id);
        if(state.isPresent()){
            return ResponseEntity.ok().body(state.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
