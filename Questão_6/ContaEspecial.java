public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(double saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }
    
    @Override
    protected void sacar(int v){
     if (saldo - v + limite < 0 ){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Ação Inválida");
        }   
    }

    @Override
    public String toString() {
        return "ContaEspecial= "+ "\nsaldo: "+ saldo + "\nlimite: " + limite;
    }
    
}
