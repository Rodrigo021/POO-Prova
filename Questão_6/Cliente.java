import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<ContaCorrente> contas;

    public Cliente(String nome, ArrayList<ContaCorrente> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<ContaCorrente> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Cliente = " + " nome: " + nome;
    }  
}
