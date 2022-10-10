public class CartaoDeCredito extends Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento com cartão de crédito realizado com sucesso.");
    }
    
}
