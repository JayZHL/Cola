/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *Clase que modela las operaciones de un sistema operativo donde van acomodando
 * los procesos
 * @author Juan Carlos Huerta Llamas
 * version Lab Algoritmos, Fecha de inicio: 2019.09.24
 * Fecha de finalizacion: 2019.10.15
 */
public class Sistema extends JFrame implements ActionListener, Runnable{
    int tiempo=1;
    int tejecucion;
    int nproceso=0;
    Cola<Procesos> cola= new Cola(10000);
    Cola<Procesos> cterminados= new Cola(10000);
    Thread t= new Thread(this);
    JButton inicia= new JButton("Iniciar");
    JButton fin=new JButton("Fin");
    JTextArea cprocesos= new JTextArea();
    JScrollPane sp= new JScrollPane(cprocesos);
    JTextArea cpterminados= new JTextArea();
    JScrollPane sp2= new JScrollPane(cpterminados);
    JTextArea cnoterminados= new JTextArea();
    JScrollPane sp3= new JScrollPane(cnoterminados);
    
    /**
     * Constructor de la clase
     */
    public Sistema() {
        setTitle("Colas");
        setLayout(null);
        setSize(1800, 10000);
        inicia.setBounds(300, 520,100,25);
        add(inicia);
        fin.setBounds(600, 520, 100, 25);
        add(fin);
        sp.setBounds(100, 100, 300, 400);
        add(sp);
        sp2.setBounds(500, 100, 300, 400);
        add(sp2);
        sp3.setBounds(900, 100, 300, 400);
        add(sp3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inicia.addActionListener(this);
        fin.addActionListener(this);
    }
    /**
     * En este metodo se va procesando todo en la cola generando los procesos
     * aleatoriamente y tomando en cuenta las condiciones que se mencionan en la
     * practica para ir haciendo los procesos
     */
     public void Empieza(){
        boolean bandera;
        boolean bandera2;
        do{
            double ale=Math.random();
            ale=ale*10+1;
            int naleatorio=(int) ale;
            bandera=Compruebapar(naleatorio);
            if(bandera){
                
                tejecucion=Aleatorio();
                nproceso++;
                cola.Insertar(new Procesos(nproceso,tiempo,tejecucion,tejecucion));

                
                cprocesos.append("Proceso "+nproceso+" se creo en t: "+tiempo);
                cprocesos.append("\nTiempo ejecucion: "+tejecucion+"\n");
                
            }
            bandera2=Multiplo3(tiempo);
            if(bandera2 &&!cola.Estavacia()){
                    if(cola.Peek().getTiemporestante()>3){
                        cola.Peek().setTiemporestante(cola.Peek().getTiemporestante()-3);
                        

                        cprocesos.append("Proceso "+cola.Peek().getNproceso()
                                 +" se reinserto en T: "+cola.Peek().getTiemporestante()+"s res\n");
                        cola.Insertar(cola.Peek());
                        cola.Eliminar();
                    }else{
                        if(cola.Peek().getTiemporestante()==3){
                            cola.Peek().setTiemporestante(cola.Peek().getTiemporestante()-3);
                            cola.Peek().setTiempofinal(tiempo);
                            cola.Peek().setTiempoatencion(cola.Peek().getTiempofinal()+3);

                             cprocesos.append("\n Proceso "+cola.Peek()
                                    .getNproceso()+" se inserto en terminados\n");
                            cterminados.Insertar(cola.Peek());
                            cola.Eliminar();
                        }else{
                            if(cola.Peek().getTiemporestante()<3){
                                cola.Peek().setTiempofinal(tiempo);
                                cola.Peek().setTiempoatencion(cola.Peek().getTiempofinal()+(3-cola.Peek().getTiemporestante()));
                                cola.Peek().setTiemporestante(0);

                                cprocesos.append("\n Proceso "+cola.Peek()
                                    .getNproceso()+" se inserto en terminados\n");
                                cterminados.Insertar(cola.Peek());
                                cola.Eliminar();
                            }
                        }
                    }
                
            }
            tiempo++;
      
        }while(tiempo<600);
        
        do{

            cpterminados.append("Proceso "+cterminados.Peek().getNproceso()+"\n");
            cpterminados.append("Tiempo inicio "+cterminados.Peek().getTiempoinicio()+"\n");
            cpterminados.append("Tiempo ejecucion:  "+cterminados.Peek().getTiempoejecucion()+"\n");
            cpterminados.append("Tiempo restante: "+cterminados.Peek().getTiemporestante()+"\n");
            cpterminados.append("Tiempo final:  "+cterminados.Peek().getTiempofinal()+"\n");
            cpterminados.append("Tiempo atencion:  "+cterminados.Peek().getTiempoatencion()+"\n");
            cterminados.Eliminar();
        }while(!cterminados.Estavacia());
        do{

            cnoterminados.setForeground(Color.red);
            cnoterminados.append("\n Proceso "+cola.Peek().getNproceso()+"\n");
            cnoterminados.append("Tiempo inicio "+cola.Peek().getTiempoinicio()+"\n");
            cnoterminados.append("Tiempo ejecucion:  "+cola.Peek().getTiempoejecucion()+"\n");
            cnoterminados.append("Tiempo restante: "+cola.Peek().getTiemporestante()+"\n");
            cnoterminados.append("Tiempo final:  "+cola.Peek().getTiempofinal()+"\n");
            cnoterminados.append("Tiempo atencion:  "+cola.Peek().getTiempoatencion()+"\n");
            
            cola.Eliminar();            
        }while(!cola.Estavacia());
    }
    /**
     * Comprueba que el numero sea par
     * @param n
     * @return 
     */
    public boolean Compruebapar(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Comprueba los tres segundos
     * @param n
     * @return 
     */
    public boolean Multiplo3(int n){
        if(n%3==0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Genera numero aleatorio entre 2 y 10
     * @return 
     */
    public int Aleatorio(){
        Random r= new Random();
        return r.nextInt(((10-2))+1)+2;
        
    }
    

    @Override
    /**
     * Metodos para los JButtons
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==inicia){
          t.start();
      }
       if(e.getSource()==fin){
            System.exit(0);
        }
    }
    /**
     * Metodo para inicializar el metodo Empezar()
     */
    @Override
    public void run() {
        Empieza();
    }

}
