package Questão_1;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> carrinho = new ArrayList<>();
    

    public void add_Produto(Produto produto) {
        carrinho.add(produto);
    }

    public double valor_Compra() {
        double total_produto = 0;
        for (Produto produto : carrinho) {
            total_produto += produto.valor_total();
        }
        return total_produto;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void lista_Produtos() {
        for (Produto produto : carrinho) {
            System.out.println(produto);
        }
    }

    
    

}
