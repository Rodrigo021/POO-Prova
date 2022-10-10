package Questão_1;

public class Item {
    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }

    
    public String to_String(){
        return "Nome do Item: "+nome+"\nValor do Item: "+valor;
    }
    
}
