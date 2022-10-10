package Questão_2;

public class Program {
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento();
        e.adicionarCarro(new Carro("Fiat Marea Turbo", 3, 4));
        e.adicionarCarro(new Carro("Ferrari", 4, 4));
        e.listar_Carros();
        System.out.println("\nPessoas no estacionamento: " + e.getpessoasEstacionamento());

    }
}
