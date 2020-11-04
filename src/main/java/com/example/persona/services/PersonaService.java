package com.example.persona.services;

import com.example.persona.Entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> search(String filtro) throws  Exception;
    Page<Persona> search(String filtro, Pageable pageable) throws  Exception;
}
