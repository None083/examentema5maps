/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author noelia
 */
public class MapDesfibrilador {
    
    protected Map<Object ,Object> objeto = new HashMap<>();

    public MapDesfibrilador(List<Desfibrilador> d, boolean b) {
        for (int i = 0; i < d.size(); i++) {
            this.objeto.put(d.get(i).getId(), d.get(i));
        }
    }
    
    private void objetoEsta(Desfibrilador d){
        this.objeto.containsKey(d.getId());
    }
    
    private List<Desfibrilador> valoresMap(){
        List<Desfibrilador> aux = new ArrayList<Desfibrilador>();
        for (int i = 0; i < this.objeto.size(); i++) {
            aux.add(this.objeto.getOrDefault(i, aux));
        }
        return aux;
    }
    
}
