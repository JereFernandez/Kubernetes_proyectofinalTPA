package com.example.persona.services;

import com.example.persona.Entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    public List<E> FindAll()throws Exception;
    public Page<E> FindAll(Pageable pageable) throws Exception;
    public E FindById(ID id)throws Exception;
    public E Save (E entity) throws Exception;
    public E Update(ID id, E entity) throws Exception;
    public boolean Delete(ID id) throws Exception;

}