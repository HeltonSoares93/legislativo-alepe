package com.heltonaleper.pr_legislativo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heltonaleper.pr_legislativo.Model.Oficio;

@Repository
public interface OficioRepository extends JpaRepository<Oficio, Integer> {
    // crud
}
