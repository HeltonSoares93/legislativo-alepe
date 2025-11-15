package com.heltonaleper.pr_legislativo.Model;

import java.time.LocalDate;

import com.heltonaleper.pr_legislativo.EnumsModels.Parecer;
import com.heltonaleper.pr_legislativo.EnumsModels.Status_pl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "projetodelei")
public class Projetodelei {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int numeropl;

    @Column(nullable = false)
    private String ementa;

    @Lob
    @Column(name = "teor", nullable = false, columnDefinition = "TEXT")
    private String teor;

    @Column(name = "data_protocolo", nullable = false)
    private LocalDate data_protocolo;

    @Column(name = "data_votacao")
    private LocalDate data_votacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "parecer_cclj")
    private Parecer parecer_cclj;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pl")
    private Status_pl status_pl;

    public Projetodelei() {
    }

    public Projetodelei(int numeropl, String ementa, String teor, LocalDate data_protocolo, LocalDate data_votacao,
            Parecer parecer_cclj, Status_pl status_pl) {
        this.numeropl = numeropl;
        this.ementa = ementa;
        this.teor = teor;
        this.data_protocolo = data_protocolo;
        this.data_votacao = data_votacao;
        this.parecer_cclj = parecer_cclj;
        this.status_pl = status_pl;
    }

    public Projetodelei(int numeropl, String ementa, String teor, LocalDate data_protocolo, Status_pl status_pl) {
        this.numeropl = numeropl;
        this.ementa = ementa;
        this.teor = teor;
        this.data_protocolo = data_protocolo;
        this.data_votacao = null;
        this.parecer_cclj = null;
        this.status_pl = status_pl;
    }

    public int getNumeropl() {
        return numeropl;
    }

    public void setNumeropl(int numeropl) {
        this.numeropl = numeropl;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getTeor() {
        return teor;
    }

    public void setTeor(String teor) {
        this.teor = teor;
    }

    public LocalDate getData_protocolo() {
        return data_protocolo;
    }

    public void setData_protocolo(LocalDate data_protocolo) {
        this.data_protocolo = data_protocolo;
    }

    public LocalDate getData_votacao() {
        return data_votacao;
    }

    public void setData_votacao(LocalDate data_votacao) {
        this.data_votacao = data_votacao;
    }

    public Parecer getParecer_cclj() {
        return parecer_cclj;
    }

    public void setParecer_cclj(Parecer parecer_cclj) {
        this.parecer_cclj = parecer_cclj;
    }

    public Status_pl getStatus_pl() {
        return status_pl;
    }

    public void setStatus_pl(Status_pl status_pl) {
        this.status_pl = status_pl;
    }

}
