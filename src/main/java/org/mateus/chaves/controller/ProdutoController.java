package org.mateus.chaves.controller;

import org.mateus.chaves.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private final List<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, String descricao, double valor, boolean disponivel) {
        Produto produto = new Produto(nome, descricao, valor, disponivel);
        produtos.add(produto);
    }

    public List<Produto> getProdutosOrdenadosPorValor() {
        return produtos.stream()
                .sorted((p1, p2) -> Double.compare(p1.getValor(), p2.getValor()))
                .toList();
    }
}

