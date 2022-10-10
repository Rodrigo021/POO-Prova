public class App {

    public static void main(String[] args) {
        Login loginForms = new Formulario("giovanna_almeida@arapiraca.ufal.br", "senha123"); 
        loginForms.logar();

        Login loginGoogle = new Google();
        loginGoogle.logar();
        
        Login loginFacebook = new Facebook();
        loginFacebook.logar();
    }
     
}
