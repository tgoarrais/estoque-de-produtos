package br.com.meva.classes;


import java.util.ArrayList;

public class Estoque {
    ArrayList <Produto> produtos = new ArrayList<>();

    //metodo para adicionar produtos ao estoque
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    //metodo para listar todos os produtos do estoque
    public void listarProdutos(){
        for(Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    //metodo para atualizar a quantidade dos produtos do estoque
    public void atualizarQuantidade(String codigo, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produto.setQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Produto com código " + codigo + " não encontrado.");
    }

    //metodo para buscar produto especifico no estoque
    public Produto buscarProduto(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    // Remover produto do estoque
    public void removerProduto(String codigo) {
        boolean produtoEncontrado = false;
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produtos.remove(produto);
                produtoEncontrado = true;
                break; // Produto encontrado e removido, então saímos do loop
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Produto com código " + codigo + " não encontrado.");
        }

    }


}


