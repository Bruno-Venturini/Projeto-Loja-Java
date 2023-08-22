package org.example;

import org.example.enums.FormaPagamento;
import org.example.model.*;
import org.example.model.balanco.Balanco;
import org.example.model.compra.Compra;
import org.example.model.compra.ItemCompra;
import org.example.model.locacao.ItemLocacao;
import org.example.model.locacao.Locacao;
import org.example.model.venda.ItemVenda;
import org.example.model.venda.Venda;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Dell Ltda");

        Cliente cliente = new Cliente();
        cliente.setNome("Bruno Kurzawe");

        Produto produto = new Produto("Computador", "I5 8gb");
        Servico servico = new Servico("Instalação Office", 2.0, 100.00);

        Compra compra = new Compra();
        compra.setDataCompra(LocalDate.now());
        compra.setFornecedor(fornecedor);
        ItemCompra itemC1 = new ItemCompra(produto, 1000.00, 10.0, 10.0);
        compra.addItemCompra(itemC1);

        Venda venda = new Venda();
        venda.setDataVenda(LocalDate.now());
        venda.setCliente(cliente);
        ItemVenda item = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda.addItemVenda(item);

        Venda venda2 = new Venda();
        venda2.setDataVenda(LocalDate.now());
        venda2.setCliente(cliente);
        ItemVenda item2 = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda2.addItemVenda(item2);
        ItemVenda item3 = new ItemVenda(servico, 150.00, 1.0, 10.0);
        venda2.addItemVenda(item3);

        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setDataLocacao(LocalDate.now());
        ItemLocacao itemL1 = new ItemLocacao(produto, 150.00, 10.0, 0.0);
        locacao.addItemLocacao(itemL1);

        Balanco balanco = new Balanco();

        balanco.setId(1L);
        balanco.setDataBalanco(LocalDate.now());
        balanco.setResponsavel("Maria luiza");
        balanco.addOperacao(venda);
        balanco.addOperacao(venda2);
        balanco.addOperacao(compra);
        balanco.addOperacao(locacao);

        balanco.imprimirBalanco();
    }
}
