package com.heltonaleper.pr_legislativo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heltonaleper.pr_legislativo.Model.Oficio;
import com.heltonaleper.pr_legislativo.Repository.OficioRepository;

@RestController
@RequestMapping("/oficios")
public class OficioController {

    @Autowired
    private OficioRepository repository;

    @GetMapping
    public List<Oficio> findAll() {
        return repository.findAll();
    }
}
