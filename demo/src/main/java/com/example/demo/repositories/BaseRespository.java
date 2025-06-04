package com.example.demo.repositories;

import com.example.demo.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRespository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID>{
}
