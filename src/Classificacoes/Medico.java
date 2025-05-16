package Classificacoes;

import Pessoa.Conta;
import Pessoa.Contato;
import Pessoa.Endereco;
import Pessoa.Fisico;

public class Medico extends Funcionario{
    private String especialidade;

    /***************************** CONSTRUTOR *******************************/

    public Medico(String nome, String cpf, int idade, Fisico f, Endereco e, Contato t, Conta c, int idfuncionario, float salarioBase, String especialidade) {
        super(nome, cpf, idade, f, e, t, c, idfuncionario, salarioBase);
        this.especialidade = especialidade;
    }

    /***************************** GETS *******************************/
    public String getEspecialidade() {
        return especialidade;
    }

    /***************************** SETS *******************************/
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    /***************************** METODOS *******************************/

    public void visualizarDadosPaciente(Paciente paciente){
        paciente.visualizarDados();
    }

}
