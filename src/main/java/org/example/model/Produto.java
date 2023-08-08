package org.example.model;

import org.example.enums.Status;

import java.time.LocalDate;

public class Produto {

    public Long id;
    public String nome;
    public String descricao;
    public Double precoVenda;
    public Double precoCompra;
    public LocalDate dataValidade;
    public LocalDate dataPrazo;
    public Status status;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, Double precoVenda,
                   Double precoCompra, LocalDate dataValidade, LocalDate dataPrazo, Status status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.dataPrazo = dataPrazo;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double calculaMargemDeLucro() {
        double lucro = precoVenda - precoCompra;
        double margemLucro = (lucro/precoVenda) * 100;

        return margemLucro;
    }
}