package Classificacoes;

import Pessoa.Conta;
import Pessoa.Contato;
import Pessoa.Endereco;
import Pessoa.Fisico;

public class Medico extends Funcionario{
    private String especialidade;
    private int num_pacientes;

    /***************************** CONSTRUTOR *******************************/

    protected Medico(String nome, String cpf, int idade, Fisico f, Endereco e, Contato t, Conta c, int idfuncionario, float salarioBase, String especialidade, int num_pacientes) {
        super(nome, cpf, idade, f, e, t, c, idfuncionario, salarioBase);
        this.especialidade = especialidade;
        this.num_pacientes = num_pacientes;
    }

    /***************************** GETS *******************************/
    public String getEspecialidade() {
        return especialidade;
    }

    public int getNum_pacientes() {
        return num_pacientes;
    }

    /***************************** SETS *******************************/
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setNum_pacientes(int num_pacientes) {
        this.num_pacientes = num_pacientes;
    }

    /***************************** METODOS *******************************/

    public void visualizarDadosPaciente(){

    }

    public void visualizarConsultasAgendadas(){

    }

}
