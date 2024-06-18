package br.com.meva;

import br.com.meva.classes.*;

public class SistemaEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto p1 = new Eletronico("Smartphone", "E001", 999.99, 10);
        Produto p2 = new Roupa("Camiseta", "R001", 29.99, 50);
        Produto p3 = new Alimento("Maçã", "A001", 0.99, 100);
        Produto p4 = new Eletronico("Computador", "E002", 1499.99, 20);
        Produto p5 = new Roupa("Calça", "R002", 89.99, 40);
        Produto p6 = new Alimento("Arroz", "A002", 23.99, 20);
        Produto p7 = new Eletronico("Lamborghini", "E003", 10000000.99, 1);


        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);
        estoque.adicionarProduto(p4);
        estoque.adicionarProduto(p5);
        estoque.adicionarProduto(p6);
        estoque.adicionarProduto(p7);

//        System.out.println("Lista de produtos em estoque:");
//        estoque.listarProdutos();
//
        System.out.println("\nAtualizando quantidade do produto com código E003:");
        estoque.atualizarQuantidade("E003", -1);
//
//       estoque.listarProdutos();
//
        System.out.println("\nBuscando produto com código E003:");
        Produto produtoBuscado = estoque.buscarProduto("E003");
        if (produtoBuscado != null) {
            System.out.println(produtoBuscado.getDescricao() + " - " + produtoBuscado);
        } else {
            System.out.println("Produto não encontrado.");
        }


//        estoque.listarProdutos();

        System.out.println("\nRemovendo produto com código A003:");
        estoque.removerProduto("E003");

        estoque.listarProdutos();
}
}