public class Admin {
    private final String login;
    private final String senha;

    public Admin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public static void main(String[] args) {
        Admin admin = new Admin("adminLogin", "adminSenha");

        String inputLogin = "adminLogin";
        String inputSenha = "adminSenha";

        if (admin.autenticar(inputLogin, inputSenha)) {
            System.out.println("Autenticado como administrador.");
        } else {
            System.out.println("Falha na autenticação.");
        }
    }
}
