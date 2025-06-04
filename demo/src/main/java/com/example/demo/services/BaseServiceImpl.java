package com.example.demo.services;

import com.example.demo.entities.Base;
import com.example.demo.repositories.BaseRespository;

import java.io.Serializable;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRespository<E, ID> baseRespository;

    public BaseServiceImpl(BaseRespository<E, ID> baseRespository) {
        this.baseRespository = baseRespository;
    }
}
