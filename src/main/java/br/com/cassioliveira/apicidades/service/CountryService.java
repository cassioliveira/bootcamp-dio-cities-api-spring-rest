package br.com.cassioliveira.apicidades.service;

import br.com.cassioliveira.apicidades.model.Country;
import br.com.cassioliveira.apicidades.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Page<Country> countries(Pageable page){
        return countryRepository.findAll(page);
    }

    public Optional<Country> getOne(Long id){
        return countryRepository.findById(id);
    }

}
