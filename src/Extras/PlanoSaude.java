package Extras;

public class PlanoSaude {
    private String nome;
    private String cobertura;

    /***************************** CONSTRUTOR *******************************/

    public PlanoSaude(String nome, String cobertura){
        this.nome = nome;
        this.cobertura = cobertura;
    }

    /***************************** GETS *******************************/
    public String getNome() {
        return nome;
    }

    public String getCobertura() {
        return cobertura;
    }

    /***************************** SETS *******************************/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    /***************************** METODOS *******************************/
}
