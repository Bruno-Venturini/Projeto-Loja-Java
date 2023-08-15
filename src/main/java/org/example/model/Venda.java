package org.example.model;

import org.example.enums.FormaPagamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends EntityId{

    private LocalDate dataVenda;
    private FormaPagamento formaPagamento;
    private String observacao;
    private Cliente cliente;
    private List<ItemVenda> itens = new ArrayList<>();

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void addItemVenda(ItemVenda item) {
        this.itens.add(item);
    }

    public void delItemVenda(ItemVenda item) {
        this.itens.remove(item);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "dataVenda=" + dataVenda +
                ", formaPagamento=" + formaPagamento +
                ", observacao='" + observacao + '\'' +
                ", cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}
