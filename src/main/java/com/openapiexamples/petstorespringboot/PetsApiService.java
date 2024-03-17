package com.openapiexamples.petstorespringboot;

import com.openapiexamples.petstorespringboot.api.PetsApiDelegate;
import com.openapiexamples.petstorespringboot.openapi.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsApiService implements PetsApiDelegate {

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        return ResponseEntity.ok(List.of(new Pet(1L, "dog"), new Pet(2L, "cat")));
    }
}
