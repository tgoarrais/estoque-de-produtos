package br.com.meva.classes;

public class Roupa extends Produto{ //Subclasse de Produto conceito de herança
    public Roupa(String nome, String codigo, double preco, int quantidade) {
        super(nome, codigo, preco, quantidade);
    }

    //Polimorfismo
    @Override
    public String getDescricao() {
        return "Roupa: " + getNome() + " (Código: " + getCodigo() + ")" ;
    }

    //Polimorfismo
    @Override
    String getGarantia() {
        return "Garantia de uma semana para troca em caso de defeito";
    }
}
