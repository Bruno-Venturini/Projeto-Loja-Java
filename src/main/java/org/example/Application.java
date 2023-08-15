package org.example;

import org.example.enums.FormaPagamento;
import org.example.model.*;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Cliente bruno = new Cliente();

        bruno.setNome("Bruno Venturini");
        bruno.setCpf("07222267741");

        Venda venda = new Venda();

        venda.setDataVenda(LocalDate.now());
        venda.setCliente(bruno);
        venda.setFormaPagamento(FormaPagamento.PIX_FISICO);
        venda.setObservacao("Observação");

        Produto produto = new Produto("Computador", "i5 8Gb");
        ItemVenda itemVenda = new ItemVenda(produto, 100.00, 1.00, 10.00);
        venda.addItemVenda(itemVenda);

        Produto produto2 = new Produto("Computador", "i7 16Gb");
        ItemVenda itemVenda2 = new ItemVenda(produto2, 100.00, 1.00, 10.00);
        venda.addItemVenda(itemVenda2);

        System.out.println(venda.getItens());
    }
}
