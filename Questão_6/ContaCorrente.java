public class ContaCorrente {
    protected double saldo;
    
    public void conta(){
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
       
    public void depositar(int v) {
        if (v < 0){
            this.setSaldo(v + this.getSaldo());
    } else{
            System.out.println("Ação Inválida");
        }
    }
    protected void sacar(int v) {
        if (saldo - v < 0 ){
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
    protected boolean transferir(ContaCorrente conta, double ValorTransferido){
        this.sacar((int) ValorTransferido);
        conta.depositar((int) ValorTransferido);
        return true;
    }

    @Override
    public String toString() {
        return "ContaCorrente = " + "\nsaldo: " + saldo;
    }
}
