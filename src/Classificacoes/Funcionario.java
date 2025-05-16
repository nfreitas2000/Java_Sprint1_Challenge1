package Classificacoes;

import Pessoa.Pessoa;
import Pessoa.Fisico;
import Pessoa.Endereco;
import Pessoa.Contato;
import Pessoa.Conta;

import java.util.Scanner;


public class Funcionario extends Pessoa {
    protected int idfuncionario;
    protected String horarioSaida;
    protected String horarioEntrada;



    /***************************** CONSTRUTOR *******************************/

    protected Funcionario(String nome, String cpf, int idade, Fisico f, Endereco e, Contato t, Conta c, int idfuncionario, float salarioBase){
        super(nome, cpf, idade, f, t, e, c);
        this.idfuncionario = idfuncionario;
    }

    /***************************** GETS *******************************/
    public int getIdfuncionario() {
        return idfuncionario;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }


    /***************************** SETS *******************************/
    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    /***************************** METODOS *******************************/

    public void marcarHorarioEntrada(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi o horario de entrada do funcionário?");
        System.out.print("Digite: ");
        setHorarioEntrada(sc.nextLine());

        System.out.println("Entrada registrada!");
    }

    public void marcarHorarioSaida(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi o horario de saída do funcionário?");
        System.out.print("Digite: ");
        setHorarioSaida(sc.nextLine());

        System.out.println("Saída registrada!");
    }

    public void visualizarHorarios(){
        if (horarioEntrada == null && horarioSaida == null) {
            System.out.println("Nenhum horário foi registrado hoje.");
        } else if (horarioEntrada == null) {
            System.out.println("Entrada: Não foi registrada.");
            System.out.println("Saída: " + getHorarioSaida());
        } else if (horarioSaida == null) {
            System.out.println("Entrada: " + getHorarioEntrada());
            System.out.println("Saída: Não foi registrada.");
        } else {
            System.out.println("Entrada: " + getHorarioEntrada());
            System.out.println("Saída: " + getHorarioSaida());
        }
    }
}
