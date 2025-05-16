package Extras;

import Classificacoes.Medico;
import Classificacoes.Paciente;

public class Consulta {
    private String data;
    private String hora;
    private Paciente paciente;
    private Medico medico;


    /***************************** CONSTRUTOR *******************************/

    public Consulta(String data, String hora, Paciente paciente, Medico medico) {
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    /***************************** GETS *******************************/

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    /***************************** SETS *******************************/

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /***************************** METODOS *******************************/

    public void exibirDadosConsulta(){
        System.out.println("===========================================================================");
        System.out.println("Data da consulta: " + data);
        System.out.println("Hora da consulta: " + hora);
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
    }
}
