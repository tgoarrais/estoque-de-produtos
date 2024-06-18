package br.com.meva.classes;

public class Eletronico extends Produto{//Subclasse de Produto conceito de herança

    public Eletronico(String nome, String codigo, double preco, int quantidade){
        super(nome, codigo, preco, quantidade);

    }

    //Polimorfismo
    @Override
    public String getDescricao() {
        return "Eletrônico: " + getNome() + " (Código: " + getCodigo() + ")";
    }

    @Override
    String getGarantia() {
        return "Esse Produto tem 6 meses de garantia";
    }
}
