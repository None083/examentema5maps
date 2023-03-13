/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author noelia
 */
public class Ej1 {

    public static void main(String[] args) {
        
        List<Desfibrilador> lista = new ArrayList<Desfibrilador>();
        
        UtilesDesfibrilador lista = new UtilesDesfibrilador();
        
        //coleccionDesfibriladores(lista.)
        
    }
    
    private static Set<Desfibrilador> coleccionDesfibriladores(List<Desfibrilador> lista){
        
        Set<Desfibrilador> aux = new TreeSet<>();
        
        for (int i = 0; i < lista.size(); i++) {
            aux.add(lista.get(i));
        }
        
        return aux;
    }
    
    private static Map<Integer, Set<Desfibrilador>> mapDesfibriladores(Set<Desfibrilador> coleccion){
        Map<Integer, Set<Desfibrilador>> aux = new TreeMap<>();
        
//        for (Iterator<Desfibrilador> d : coleccion) {
//            
//        }

        return aux;
    }
    
}
