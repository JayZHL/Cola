/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

/**
 *Clase que modela los atributos de los procesos
 * @author Juan Carlos Huerta Llamas
 * version Lab Algoritmos, Fecha de inicio: 2019.09.24
 * Fecha de finalizacion: 2019.10.15
 */
public class Procesos {
    int tiempo=0;
    int tiempoinicio;
    int tiempoejecucion;
    int tiemporestante;
    int tiempofinal;
    int tiempoatencion;
    int nproceso;

    /**
     * Constructor procesos
     * @param nproceso
     * @param tiempoinicio
     * @param tiempoejecucion
     * @param tiemporestante 
     */
    public Procesos(int nproceso,int tiempoinicio,int tiempoejecucion, int tiemporestante) {
        this.nproceso=nproceso;
        this.tiempoinicio = tiempoinicio;
        this.tiempoejecucion=tiempoejecucion;
        this.tiemporestante=tiemporestante;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempoinicio() {
        return tiempoinicio;
    }

    public void setTiempoinicio(int tiempoinicio) {
        this.tiempoinicio = tiempoinicio;
    }
        
    public int getTiempoejecucion() {
        return tiempoejecucion;
    }

    public void setTiempoejecucion(int tiempoejecucion) {
        this.tiempoejecucion = tiempoejecucion;
    }

    public int getTiemporestante() {
        return tiemporestante;
    }

    public void setTiemporestante(int tiemporestante) {
        this.tiemporestante = tiemporestante;
    }

    public int getTiempofinal() {
        return tiempofinal;
    }

    public void setTiempofinal(int tiempofinal) {
        this.tiempofinal = tiempofinal;
    }

    public int getTiempoatencion() {
        return tiempoatencion;
    }

    public void setTiempoatencion(int tiempoatencion) {
        this.tiempoatencion = tiempoatencion;
    }

    public int getNproceso() {
        return nproceso;
    }

    public void setNproceso(int nproceso) {
        this.nproceso = nproceso;
    }

    @Override
    public String toString() {
        return "Procesos{" + "tiempo=" + tiempo + ", tiempoinicio=" + 
                tiempoinicio + ", tiempoejecucion=" + tiempoejecucion 
                + ", tiemporestante=" + tiemporestante + ", tiempofinal=" 
                + tiempofinal + ", tiempoatencion=" + tiempoatencion 
                + ", nproceso=" + nproceso + '}';
    }
    
    
    
}
