package com.example.demo.services;

import com.example.demo.entities.Persona;
import com.example.demo.repositories.BaseRespository;
import com.example.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Integer> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRespository<Persona, Integer> baseRespository, PersonaRepository personaRepository) {
        super(baseRespository);
        this.personaRepository = personaRepository;
    }
}
