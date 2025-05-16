package Pessoa;

public class Fisico {
    private double peso;
    private double altura;
    private String tipoSanguineo;

    /***************************** CONSTRUTOR *******************************/

    public Fisico(double peso, double altura, String tipoSanguineo){
        this.peso = peso;
        this.altura = altura;
        this.tipoSanguineo = tipoSanguineo;
    }

    public Fisico() {}

    /***************************** GETS *******************************/
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    /***************************** SETS *******************************/
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    /***************************** METODOS *******************************/

    public String getDadosFisicos(){
        return "Peso: " + peso + " KG" + "\n" + "Altura: " + altura + " Metros" + "\n" + "Tipo Sanguineo: " + tipoSanguineo;
    }



}
