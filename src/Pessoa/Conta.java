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

        System.out.print("Primeiro de tudo, digite qual será seu novo usuário: ");
        setUsuario(sc.next());
        System.out.print("Muito bem! Agora digite sua senha: ");
        setSenha(sc.next());
        System.out.println("Muito bom! Sua conta foi criada, agora basta entrar no nosso sistema!");
    }

    public boolean verificadorLogin(String user, String senha){
        if (user.equals(getUsuario()) && (senha.equals(getSenha())))
            return true;
        else {
            return false;
        }
    }

    public boolean realizarLogin(){

        int i = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Digite o usuário: ");
            String usuarioDigitado = sc.next();
            System.out.print("Digite a senha: ");
            String senhaDigitada = sc.next();

            if (verificadorLogin(usuarioDigitado, senhaDigitada)) {
                System.out.println("Acesso liberado!");
                return true;
            } else if ((!verificadorLogin(usuarioDigitado, senhaDigitada))){
                System.out.println("Acesso negado!");
                return false;
            }
        }
    }



}
