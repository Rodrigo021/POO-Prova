public class ContaCorrente {

    protected double saldo;

    public void conta() {
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
        if (v < 0) {
            System.out.println("Ação Inválida");
        } else {
            this.setSaldo(v + this.getSaldo());  
            System.out.println("Deposito realizado com sucesso");
        }
    }

    protected boolean sacar(double v) {
        if (saldo - v < 0) {
            System.out.println("Ação Inválida.");
            return false;
        } else {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso.");
                return true;
            } else {
                System.out.println("Saldo Insuficiente");
                return false;
            }
        }
    }

    protected boolean transferir(ContaCorrente conta, double ValorTransferido) {
        boolean statusSacar = this.sacar((int) ValorTransferido);

        if (statusSacar) {
            conta.depositar((int) ValorTransferido);
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente = " + "\nsaldo: " + saldo;
    }
}
