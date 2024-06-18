package br.com.meva.classes;

public abstract class Produto {

    private String nome;
    private String codigo;
    protected double preco;
    private int quantidade;


    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método abstrato para ser implementado nas subclasses
    public abstract String getDescricao();

    abstract String getGarantia();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código: " + codigo + ", Preço: " + preco + ", Quantidade: " + quantidade;
    }
}


