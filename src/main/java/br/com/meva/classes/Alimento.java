package br.com.meva.classes;

public class Alimento extends Produto{//Subclasse de Produto conceito de herança
    public Alimento(String nome, String codigo, double preco, int quantidade) {
        super(nome, codigo, preco, quantidade);
    }

    //Polimorfismo
    @Override
    public String getDescricao() {
        return "Alimento: " + getNome() + " (Código: " + getCodigo() + ")";
    }

    @Override
    String getGarantia() {
        return "Garantia não se aplica para esse tipo de produto";
    }
}
