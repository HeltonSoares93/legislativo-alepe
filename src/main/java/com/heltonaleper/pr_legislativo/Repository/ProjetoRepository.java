package com.heltonaleper.pr_legislativo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heltonaleper.pr_legislativo.Model.Projetodelei;
@Repository
public interface ProjetoRepository extends JpaRepository<Projetodelei, Integer> {
// crud


}
