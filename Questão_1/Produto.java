package Questão_1;

import java.util.ArrayList;

public class Produto {
    
    private String nome;
    private ArrayList<Item> itens;

    public Produto(String nome) {
        this.nome = nome;
    }

    public void add_item(Item item) {
        itens.add(item);
    }

    
    public double valor_total() {
        double total = 0;
        for (Item item : itens) {
            total+= item.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", itens=" + itens + "]";
    }


}
