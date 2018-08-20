package com.axelfernandez.unionsrl;

import java.util.ArrayList;
import java.util.List;

public class RV {

    private String horario;
    private String observacion;


    public RV(String location, String description) {

        this.horario = location;
        this.observacion = description;

    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }



    public static List<RV> getall(String[]array){
        List<RV> fin= new ArrayList<>();
        String obser="";
        for (int i=0;i<array.length;i++){
            if (array[i].substring(5).equals("n")){ obser="Recorrido normal";}
            if (array[i].substring(5).equals("x")){ obser="Por Marzolina";}
            if (array[i].substring(5).equals("y")){ obser="Por La Inda";}
            if (array[i].substring(5).equals("z")){ obser="No corre dias sabado";}


            RV data = new RV("Salida: " + array[i],  "Informacion: " + obser);
            fin.add(data);
        }
        return fin;



    }
}
