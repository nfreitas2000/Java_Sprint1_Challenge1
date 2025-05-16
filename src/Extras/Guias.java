package Extras;

import java.util.Scanner;

public class Guias {
    private String titulo;
    private String assunto;
    private String conteudo;

    /***************************** CONSTRUTOR *******************************/

    public Guias(String titulo, String assunto, String conteudo){
        this.titulo = titulo;
        this.assunto = assunto;
        this.conteudo = conteudo;
    }

    public Guias() {
    }

    /***************************** GETS *******************************/
    public String getTitulo() {
        return titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    /***************************** SETS *******************************/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /***************************** METODOS *******************************/

    public void exibirArtigo(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Assunto: " + getAssunto());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(getConteudo());

    }

    public void mostrarConteudo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================================================");
        exibirArtigo();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("0 - Sair");
        System.out.print("Digite: ");
        sc.nextInt();
    }


}
