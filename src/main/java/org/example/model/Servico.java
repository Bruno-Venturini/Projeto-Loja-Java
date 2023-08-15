package org.example.model;

public class Servico extends ItemVendavel {
    private Double quantidadeHoras;

    public Servico(String descricao, Double valorUnitario, Double quantidadeHoras) {
        super.setDescricao(descricao);
        super.setValorUnitario(valorUnitario);
        this.quantidadeHoras = quantidadeHoras;
    }

    public Double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
