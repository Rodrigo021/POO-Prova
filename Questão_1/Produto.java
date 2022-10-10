package Questão_1;

import java.util.ArrayList;

public class Produto {
    
    private String nome;
    private ArrayList<Item> itens;

    public Produto(String nome, ArrayList<Item> itens) {
        this.nome = nome;
        this.itens = itens;
    }

    public ArrayList<Item> add_item() {
        return itens;
    }

    
    public double valor_total() {
        double total = 0;
        for (Item item : itens) {
            total+= item.getPreco();
        }
        return total;
    }

    
    public String toString() {
        String itens = "";
        for (Item item : this.itens){
            itens += String.format("%s\n", item);
        } 
        
        return "\nNome do produto: "+ nome +"\nValor total: "+ valor_total() +"\nItens: \n"+ itens;
    
    }


}
