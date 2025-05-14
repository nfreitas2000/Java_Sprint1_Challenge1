package Pessoa;

public class Contato {
    protected String telefone;
    protected String email;

    /***************************** CONSTRUTOR *******************************/

    public Contato(String telefone, String email){
        this.telefone = telefone;
        this.email = email;
    }

    /***************************** GETS *******************************/

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    /***************************** SETS *******************************/

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /***************************** METODOS *******************************/

    public String getDadosContato(){
        return "Telefone: " + "+" + telefone.substring(0,2) + " " + "(" + telefone.substring(2,4) + ")" + " " + telefone.substring(4, 9) + "-" + telefone.substring(9) +
                "\n" + "E-mail: " + email;
    }
}
