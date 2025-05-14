package Classificacoes;

import Pessoa.Pessoa;
import Pessoa.Fisico;
import Pessoa.Endereco;
import Pessoa.Contato;
import Pessoa.Conta;


public class Funcionario extends Pessoa {
    protected int idfuncionario;
    protected float salarioBase;


    /***************************** CONSTRUTOR *******************************/

    protected Funcionario(String nome, String cpf, int idade, Fisico f, Endereco e, Contato t, Conta c, int idfuncionario, float salarioBase){
        super(nome, cpf, idade, f, t, e, c);
        this.idfuncionario = idfuncionario;
        this.salarioBase = salarioBase;
    }

    /***************************** GETS *******************************/
    public int getIdfuncionario() {
        return idfuncionario;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    /***************************** SETS *******************************/
    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    /***************************** METODOS *******************************/

    public void marcarHorarioEntrada(){

    }

    public void marcarHorarioSaida(){

    }
}
