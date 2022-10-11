import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(2210));
        contas.add(new ContaEspecial(20, 400));
        Cliente cliente = new Cliente("Giovanna", contas);
        
        
        System.out.println(cliente.toString());
        System.out.println(cliente.getContas());
        contas.get(0).sacar(200);
        System.out.println("Novo saldo: " + contas.get(0).getSaldo());
        contas.get(0).depositar(100);
        System.out.println("Novo saldo: " + contas.get(0).getSaldo());        
        contas.get(1).sacar(500);


    } 
}
