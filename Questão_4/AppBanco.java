public class AppBanco {
    public static void main(String[] args) {
        Pix pix = new Pix();
        pix.pagar();
        
        CartaoDeCredito credito = new CartaoDeCredito();
        credito.pagar();
        
        Boleto boleto = new Boleto();
        boleto.pagar();
    }
}
