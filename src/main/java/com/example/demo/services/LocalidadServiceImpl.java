package com.example.demo.services;

import com.example.demo.entities.Localidad;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Integer> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Integer> baseRepository) {
        super(baseRepository);
    }
}
