public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(double saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double v){
     if (saldo + limite  - v < 0 ){
            System.out.println("Ação Inválida.");
            return false;
        } else {
         if (v <= limite){
             System.out.println("Saque realizado com sucesso.");
             return true;
         } else {
             System.out.println("Saldo insuficiente.");
             return false;
         }
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial = "+ "\nsaldo: "+ saldo + "\nlimite: " + limite;
    }
    
}
