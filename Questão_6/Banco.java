public class Banco {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(1212));
        contas.add(new ContaEspecial(1212, 500));
        
        Cliente cliente1 = new Cliente("Rodrigo", contas);
        Cliente cliente2 = new Cliente("Giovanna", contas);
        
        System.out.println(cliente1.getContas());
        System.out.println(cliente2.getContas());
        
    } 
}
