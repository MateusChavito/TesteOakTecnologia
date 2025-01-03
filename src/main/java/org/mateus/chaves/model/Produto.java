package org.mateus.chaves.model;

public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private boolean disponivel;

    public Produto(String nome, String descricao, double valor, boolean disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
