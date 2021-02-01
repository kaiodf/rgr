package br.com.prova.java.numeros.complexos;

public class ComplexNumber {

    private double real;
    private double imaginario;

    public ComplexNumber(){
        this(0.0,0.0);
    }

    public ComplexNumber(double a, double b) {
        this.real = a;
        this.imaginario = b;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public ComplexNumber soma(ComplexNumber complexNumber) {
        if (complexNumber == null) {
            return null;
        }
        return new ComplexNumber(real+complexNumber.real, imaginario +complexNumber.imaginario);
    }

    public static ComplexNumber somarDoisNumerosComplexos(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
        ComplexNumber retorno = new ComplexNumber(complexNumber1.real, complexNumber1.imaginario);
        return retorno.soma(complexNumber2);
    }

    @Override
    public String toString() {
        return "(" + this.real + "," + this.imaginario + ")";
    }
}
