package Questão_2;

public class Carro {
    private String modelo;
    private int qPessoas;
    private int capacidadeMax;


    public Carro(String modelo, int qPessoas, int capacidadeMax) {

        if(qPessoas > capacidadeMax) {
            System.out.println("O carro "+ modelo +" não comporta mais de "+ capacidadeMax +" pessoas");
            System.exit(1);
        }

        this.modelo = modelo;
        this.qPessoas = qPessoas;
        this.capacidadeMax = capacidadeMax;
    }


    public String getModelo() {
        return modelo;
    }


    public int getqPessoas() {
        return qPessoas;
    }


    @Override
    public String toString() {
        return "Carro: " + modelo + "\nQuantidade de Pessoas: " + qPessoas;
    }


}
