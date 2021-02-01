package br.com.prova.java.numeros.complexos;

public class App {

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(10,5);
        ComplexNumber com1 = new ComplexNumber(5,10);
        ComplexNumber resul = com1.soma(complexNumber);
        System.out.println(complexNumber + " + "+ com1 +" = " +resul);

        ComplexNumber ret = ComplexNumber.somarDoisNumerosComplexos(complexNumber, com1);

        System.out.println(ret.toString());

    }
}
