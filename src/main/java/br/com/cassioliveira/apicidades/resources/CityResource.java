package br.com.cassioliveira.apicidades.resources;

import br.com.cassioliveira.apicidades.model.City;
import br.com.cassioliveira.apicidades.service.CityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cities")
public class CityResource {

    private CityService cityService;

    public CityResource(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public Page<City> cities(Pageable page){
        return cityService.cities(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<City> city = cityService.getOne(id);
        if(city.isPresent()){
            return ResponseEntity.ok().body(city.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
