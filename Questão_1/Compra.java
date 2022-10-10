package Questão_1;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> carrinho;
    private double total_produto;

    public void add_Produto(Produto produto) {
        carrinho.add(produto);
    }

    public void valor_Compra() {
        for (Produto produto : carrinho) {
            total_produto += produto.valor_total();
        }
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public double getTotal_produto() {
        return total_produto;
    }
    

}
