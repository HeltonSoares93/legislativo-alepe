package com.heltonaleper.pr_legislativo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heltonaleper.pr_legislativo.Model.Pedidoinformacao;
import com.heltonaleper.pr_legislativo.Repository.PedidoinformacaoRepository;

@RestController
@RequestMapping("/pinfo")
public class PedidoinformacaoController {

    @Autowired
    private PedidoinformacaoRepository repository;

    @GetMapping
    public List<Pedidoinformacao> findAll() {
        return repository.findAll();
    }
}
