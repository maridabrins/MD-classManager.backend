package com.mariana.aulas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariana.aulas.model.AulaModel;

@Repository
public interface AulaRepository extends JpaRepository <AulaModel, Integer> {

}
