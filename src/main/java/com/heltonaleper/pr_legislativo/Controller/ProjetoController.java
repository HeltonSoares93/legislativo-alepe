package com.heltonaleper.pr_legislativo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heltonaleper.pr_legislativo.Model.Projetodelei;
import com.heltonaleper.pr_legislativo.Repository.ProjetoRepository;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoRepository repository;

    @GetMapping
    public List<Projetodelei> findAll() {
        return repository.findAll();
    }
}
