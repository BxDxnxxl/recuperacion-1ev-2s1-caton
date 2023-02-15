/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import java.util.Observable;

/**
 *
 * @author S2-PC00
 */
public class Caballo extends Observable implements Runnable{
    private String nombre;
    private int porcentaje;

    public Caballo(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public void run() {

        int porcentaje=0;
        int random;
try{
        while(porcentaje<100){
                random = generarNumeroAleatorio(1, 15);
                System.out.println("Caballo"+ nombre+ " ha aumentado en "+ random);
                porcentaje+=random;
                this.setChanged();
                this.notifyObservers(porcentaje);
                this.clearChanged();
                Thread.sleep(1000);
        }
        } catch(InterruptedException ex){
            System.out.println("hilo interrumpido");
        }

    }


    public static int generarNumeroAleatorio(int minimo, int maximo){
        int num = (int) Math.floor(Math.random()*(maximo - minimo + 1) + (minimo));
        return num;
    }

}
