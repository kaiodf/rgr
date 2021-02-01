package br.com.prova.java.ordenar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("JOAO");
        lista.add("João");
        lista.add("PAULO");
        lista.add("Maria");
        lista.add("Paulo");
        lista.add("maria");
        lista.add("páulo");
        lista.add("leandro");

        Frequencia frequencia = new Frequencia(lista);
//        Map<String,Integer> res = frequencia.ordenarLambda();
        Map<String,Integer> ordenado = frequencia.ordenar1();

        String resultado = "{";

        for (Map.Entry<String,Integer> res : ordenado.entrySet()) {
            resultado+=res.getKey()+" = "+res.getValue()+", ";
        }

        if(resultado!="{"){
            resultado = resultado.subSequence(0,resultado.length()-2)+"}";
        }
        System.out.println(resultado);
        
    }
}
