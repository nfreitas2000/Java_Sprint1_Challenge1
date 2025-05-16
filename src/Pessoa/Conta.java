package Pessoa;

import java.util.Scanner;

public class Conta {
    private String usuario;
    private String senha;

    /***************************** CONSTRUTOR *******************************/

    public Conta(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public Conta(){}

    /***************************** GETS *******************************/

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    /***************************** SETS *******************************/

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /***************************** METODOS *******************************/

    public void criarLogin(){
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================================================");
        System.out.print("Primeiro de tudo, digite qual será seu novo usuário: ");
        setUsuario(sc.nextLine());
        System.out.print("Muito bem! Agora digite sua senha: ");
        setSenha(sc.nextLine());
        System.out.println("Muito bom! Sua conta foi criada, agora basta entrar no nosso sistema!");
        System.out.println("===========================================================================");
    }

    public boolean verificadorLogin(String user, String senha){
        if (user.equals(getUsuario()) && (senha.equals(getSenha())))
            return true;
        else {
            return false;
        }
    }

    public void realizarLogin(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o usuário: ");
            String usuarioDigitado = sc.nextLine();
            System.out.print("Digite a senha: ");
            String senhaDigitada = sc.nextLine();

            if (verificadorLogin(usuarioDigitado, senhaDigitada)) {
                System.out.println("===========================================================================");
                System.out.println("Acesso liberado!");
                System.out.println("===========================================================================");
                break;
            } else if ((!verificadorLogin(usuarioDigitado, senhaDigitada))){
                System.out.println("===========================================================================");
                System.out.println("Acesso negado!");
                System.out.println("===========================================================================");
                break;
            }
        }
    }
}
