package br.com.cassioliveira.apicidades.resources;

import br.com.cassioliveira.apicidades.model.Country;
import br.com.cassioliveira.apicidades.service.CountryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryService countryService;

    public CountryResource(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public Page<Country> countries(Pageable page){
        return countryService.countries(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> country = countryService.getOne(id);
        if(country.isPresent()){
            return ResponseEntity.ok().body(country.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
