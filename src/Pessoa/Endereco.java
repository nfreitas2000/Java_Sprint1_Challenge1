package Pessoa;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String complemento;

    /***************************** CONSTRUTOR *******************************/

    public Endereco(String rua, String numero, String cep, String complemento){
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }

    public Endereco() {
    }

    /***************************** GETS *******************************/
    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    /***************************** SETS *******************************/

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /***************************** METODOS *******************************/

    public String getDadosEndereco(){
        return "Rua: " + rua +
                "\n" + "Número: " + numero +
                "\n" + "CEP: " + cep.substring(0, 5) + "-" + cep.substring(5) +
                "\n" + "Complemento: " + complemento;
    }

}
