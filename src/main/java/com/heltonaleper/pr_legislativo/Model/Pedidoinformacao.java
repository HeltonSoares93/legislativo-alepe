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
@Table(name = "pedido_informacao")
public class Pedidoinformacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String enderecamento;
    private int numeropi;
    private String assunto;

    @Lob
    @Column(columnDefinition = "text")
    private String teor;

    private LocalDate data_protocolo;

    @Lob
    @Column(columnDefinition = "text")
    private String resposta;

    public Pedidoinformacao() {
    }

    public Pedidoinformacao(String enderecamento, int numeropi,String assunto,String teor, LocalDate data_protocolo){
        this.enderecamento = enderecamento;
        this.numeropi = numeropi;
        this.assunto = assunto;
        this.teor = teor;
        this.data_protocolo = data_protocolo;
    }

    public int getId() {
        return id;
    }

   
    public String getEnderecamento() {
        return enderecamento;
    }

    public void setEnderecamento(String enderecamento) {
        this.enderecamento = enderecamento;
    }

    public int getNumeropi() {
        return numeropi;
    }

    public void setNumeropi(int numeropi) {
        this.numeropi = numeropi;
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

    public LocalDate getdata_protocolo() {
        return data_protocolo;
    }

    public void setdata_protocolo(LocalDate data_protocolo) {
        this.data_protocolo = data_protocolo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }




}
