package br.com.prova.java.ordenar;

import java.text.Normalizer;
import java.util.*;

public class Frequencia {

    private List<String> lista;

    public Frequencia(List<String> stringList){
        this.lista = stringList;
    }

    public Map<String, Integer> ordenarLambda(){
        Map<String, Integer> map = new TreeMap<>();
        for (String c : lista) {
            String conv = Normalizer.normalize(c.toUpperCase(Locale.ROOT), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            map.compute(conv, (k, v) -> v == null ? 1 : v + 1);
        }

        return map;
    }

    public Map<String, Integer> ordenar1(){
        Map<String, Integer> map = new TreeMap<>();
        for (String c : lista) {
            String conv = Normalizer.normalize(c.toUpperCase(Locale.ROOT), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            if(map.containsKey(conv)){
                map.replace(conv,map.get(conv)+1);
            }else{
                map.put(conv,1);
            }
        }

        return map;
    }

}
