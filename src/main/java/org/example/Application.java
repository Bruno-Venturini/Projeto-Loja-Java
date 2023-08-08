package org.example;

import org.example.enums.Status;
import org.example.model.Produto;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Produto produto = new Produto(10L, "Folha","Folha A4", 1500.00, 1200.00,
                LocalDate.of(2023, 01, 1), LocalDate.of(2023, 01, 15), Status.DISPONIVEL);

//        produto.setNome("Folha A4");
//        produto.setDescricao("Folha branca, tamanho A4");
//        produto.setDataPrazo(LocalDate.of(2023, 1, 15));
//        produto.setPrecoCompra(1200.00);
//        produto.setPrecoVenda(1500.00);
//        produto.setStatus(Status.DISPONIVEL);

        System.out.println("Margem " + produto.calculaMargemDeLucro() + "%");
    }
}
