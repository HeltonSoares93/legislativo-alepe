package com.heltonaleper.pr_legislativo.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "oficios")
public class Oficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numeroof; // not null
    private String assunto;// not null
    @Lob
    @Column(columnDefinition = "TEXT")
    private String teor; // not null
    private LocalDate data_protocolo;// not null
    @Lob
    @Column(columnDefinition = "TEXT")
    private String resposta;

    public Oficio() {
    }

    public Oficio(int numeroof, String assunto, String teor, LocalDate data_protocolo) {
        this.numeroof = numeroof;
        this.assunto = assunto;
        this.teor = teor;
        this.data_protocolo = data_protocolo;
    }

    public int getId() {
        return id;
    }

    public int getNumeroof() {
        return numeroof;
    }

    public void setNumeroof(int numeroof) {
        this.numeroof = numeroof;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
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

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

}
