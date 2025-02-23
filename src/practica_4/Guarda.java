/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

/**
 *
 * @author PC
 */
//public class Guarda {
//    public void Empieza(){
//        boolean bandera;
//        boolean bandera2;
//        do{
//            double ale=Math.random();
//            ale=ale*10+1;
//            int naleatorio=(int) ale;
//            bandera=Compruebapar(naleatorio);
//            if(bandera){
//                
//                tejecucion=Aleatorio();
//                nproceso++;
//                cola.Insertar(new Procesos(nproceso,tiempo,tejecucion,tejecucion));
////                cola1.add(new Procesos(nproceso,tiempo,tejecucion,600-tiempo));
//                System.out.println("Proceso "+nproceso+" se creo en t: "+tiempo);
//                System.out.println("Tiempo ejecucion: "+tejecucion+"\n");
//                //Decrementatiempo();
//                
//                
//            }
//            bandera2=Multiplo3(tiempo);
//            if(bandera2 &&!cola.Estavacia()){
//                
//                for(int i=0;i<cola.tam;i++ ){
//                    if(cola.Elemento(i).getTiemporestante()>3){
//                        cola.Elemento(i).setTiemporestante(cola.Elemento(i).getTiemporestante()-3);
//                         System.out.println("Proceso "+cola.Elemento(i).getNproceso()
//                                 +" se reinserto en T: "+cola.Elemento(i).getTiemporestante()+"s res\n");
//                        cola.Insertar(cola.Peek());
//                        cola.Eliminar();
//                         
//                        break;
//                    }else{
//                        if(cola.Elemento(i).getTiemporestante()==3){
//                            cola.Elemento(i).setTiemporestante(cola.Elemento(i).getTiemporestante()-3);
//                            cterminados.Insertar(cola.Elemento(i));
//                            //cola.Eliminarpos(i);
//                            for(int j=0;j<cterminados.tam;j++){
//                            cterminados.Elemento(j).setTiempofinal(tiempo);
//                            cterminados.Elemento(j).setTiempoatencion(tiempo);
//                            System.out.println("Proceso "+cterminados.Elemento(j)
//                                    .getNproceso()+" se inserto en terminados");
//                            System.out.println("Proceso "+cterminados.Elemento(j).getNproceso());
//                            System.out.println("Tiempo inicio "+cterminados.Elemento(j).getTiempoinicio());
//                            System.out.println("Tiempo ejecucion:  "+cterminados.Elemento(j).getTiempoejecucion());
//                            System.out.println("Tiempo restante: "+cterminados.Elemento(j).getTiemporestante());
//                            System.out.println("Tiempo final:  "+cterminados.Elemento(j).getTiempofinal());
//                            System.out.println("Tiempo atencion:  "+cterminados.Elemento(j).getTiempoatencion());  
//                            }
//                            //cola.Eliminarpos(i);
//                            break;
//                            
//                        }else{
//                            if(cola.Elemento(i).getTiemporestante()<3){
//                                cola.Elemento(i).setTiemporestante(0);
//                                cola.Elemento(i).setTiempoejecucion(cola.Elemento(i)
//                                        .getTiempoejecucion()+(3-cola.Elemento(i).getTiemporestante()));
//                                cterminados.Insertar(cola.Elemento(i));
//                                //cola.Eliminarpos(i);
//                                
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//            tiempo++;
//            //Decrementatiempo();
////            for(int k=0;k<cola.tam;k++){
////                cola.Elemento(k).setTiemporestante(cola.Elemento(k).getTiemporestante()-1);
////            }
//        }while(tiempo!=600);
//    }
//}
