/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

/**
 *Clase que modelo la estructura de la cola 
 * @author Juan Carlos Huerta Llamas
 * version Lab Algoritmos, Fecha de inicio: 2019.09.24
 * Fecha de finalizacion: 2019.10.15
 */
public class Cola<E> {
    E[]cola;
    int inicio;
    int fin;
    int tam;
    int cont;
    /**
     * Constructor de la cola
     * @param tam 
     */
    Cola(int tam){
        this.tam=tam;
        cola= (E[])new Object[tam];
        inicio=-1;
        fin=-1;
        cont=0;
    }
    /**
     * Metodo para insertar la cola
     * @param dato 
     */
    public void Insertar(E dato){
        if(fin <tam){
            fin++;
            cola[fin]=dato;
            cont++;
            if(fin==0){
                inicio=0;
            }
        }else{
                System.out.println("Desbordamiento");
            }
    }
    /**
     * Metodo para Eliminar el elemento de la cola
     * @return 
     */
    public E Eliminar(){
        E dato;
        if(inicio==-1){
            System.out.println("Subdesbordamiento");
            return null;
        }else{
            dato=cola[inicio];
            if(inicio==fin){
                inicio=-1;
                fin=-1;
                cont=0;
            }else{
                inicio=inicio+1;
                cont--;
            }
            return dato;
           
        }
    }
    
    public E Eliminarpos(int pos){
        E dato;
        if(inicio==-1){
            System.out.println("Subdesbordamiento");
            return null;
        }else{
            
            dato=cola[pos];
            if(inicio==fin){
                inicio=-1;
                fin=-1;
            }else{
                inicio++;
                
            }
            return dato;
           
        }
    }
    /**
     * Metodo para mostrar la cola
     */
    public void Mostrar(){
        for(int i=inicio; i<cola.length;i++){
            System.out.println(cola[i]);
        }
    }
    
 
    /**
     * Metodo para mostrar el primer elemento de la cola
     * @return 
     */
    public E Peek(){
        if(!Estavacia()){
        return cola[inicio];
        }else{
            return null;
        }
    }
    /**
     * Metodo para saber si la cola esta vacia o no
     * @return 
     */
    public boolean Estavacia(){
        if(inicio==-1){
            return true;
        }else{
            return false;
        }
    }
}
