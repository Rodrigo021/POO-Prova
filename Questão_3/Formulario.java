public class Formulario implements Login {
    protected String email;
    protected String senha;

    public Formulario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void logar() {
        System.out.println("Logando com formulário, com o email: " + email);
        System.out.println("e a senha: " + senha);
    }
    
    
}
