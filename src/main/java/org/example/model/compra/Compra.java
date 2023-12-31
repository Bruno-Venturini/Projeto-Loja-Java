package org.example.model.compra;

import org.example.enums.TipoOperacao;
import org.example.interfaces.OperacaoFinanceira;
import org.example.model.abstracts.EntityId;
import org.example.model.Fornecedor;
import org.example.model.venda.ItemVenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra extends EntityId implements OperacaoFinanceira {

    private List<ItemCompra> itens = new ArrayList<>();
    private LocalDate dataCompra;
    private Fornecedor fornecedor;
    private String observacao;

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    public void addItemCompra(ItemCompra item) {
        this.itens.add(item);
    }

    public void delItemCompra(ItemCompra item) {
        this.itens.remove(item);
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataCompra();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream()
                .mapToDouble(ItemCompra::getValorCalculado)
                .sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.DEBITO;
    }
}
