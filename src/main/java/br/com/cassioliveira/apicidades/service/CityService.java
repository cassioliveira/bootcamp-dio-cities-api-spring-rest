package br.com.cassioliveira.apicidades.service;

import br.com.cassioliveira.apicidades.model.City;
import br.com.cassioliveira.apicidades.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Page<City> cities(Pageable page){
       return cityRepository.findAll(page);
    }

    public Optional<City> getOne(Long id){
        return cityRepository.findById(id);
    }

}
