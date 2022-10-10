package Questão_2;

import java.util.ArrayList;

public class Estacionamento {
    ArrayList<Carro> carros = new ArrayList<>();

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public int getpessoasEstacionamento() {
        int totalDePessoas = 0;
        for (Carro carro : carros) { 
            totalDePessoas += carro.getqPessoas();
        }
        return totalDePessoas;
    }

    public void listar_Carros() {
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}
