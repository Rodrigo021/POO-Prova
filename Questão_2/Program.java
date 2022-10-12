package Questão_2;

public class Program {
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento();
        e.adicionarCarro(new Carro("Volkswagen Gol", 4, 5));
        e.adicionarCarro(new Carro("Dogde Hellcat", 1, 2));
        e.listar_Carros();
        System.out.println("\nPessoas no estacionamento: " + e.getpessoasEstacionamento());

    }
}
