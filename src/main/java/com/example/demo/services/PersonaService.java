package com.example.demo.services;

import com.example.demo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService extends BaseService<Persona, Integer> {

    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;

}
