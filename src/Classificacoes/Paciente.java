package Classificacoes;

import Extras.PlanoSaude;
import Pessoa.Pessoa;
import Pessoa.Fisico;
import Pessoa.Endereco;
import Pessoa.Contato;
import Pessoa.Conta;


public class Paciente extends Pessoa {
    private int idpaciente;
    private PlanoSaude plano;


    /***************************** CONSTRUTOR *******************************/

    public Paciente(String nome, String cpf, int idade, Fisico f, Endereco e, Contato t, Conta c, int idpaciente, PlanoSaude plano){
        super(nome, cpf, idade, f, t, e, c);
        this.idpaciente = idpaciente;
        this.plano = plano;
    }

    /***************************** GETS *******************************/
    public int getIdpaciente() {
        return idpaciente;
    }

    public PlanoSaude getPlano() {
        return plano;
    }

    /***************************** SETS *******************************/
    public void setPlano(PlanoSaude plano) {
        this.plano = plano;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    /***************************** METODOS *******************************/
}
