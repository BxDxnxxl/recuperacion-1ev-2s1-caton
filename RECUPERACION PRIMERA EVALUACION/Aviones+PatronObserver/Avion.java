import java.util.ArrayList;

public abstract class Avion extends Thread implements IAvion {
    private String nombre;
    private ArrayList<IAvion> lstAviones = new ArrayList<IAvion>();


    public Avion(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void anadirAvion(IAvion a) {
        lstAviones.add(a);
    }


    public void eliminarAvion(IAvion a) {
        lstAviones.remove(a);
    }


    @Override
    public void girarDerecha() {
        System.out.println("Avión [" + this.getNombre() + "] girando a la derecha");
        
        for (IAvion avion : lstAviones) {
            avion.girarDerecha();
        }
    }


    @Override
    public void girarIzquierda() {
        System.out.println("Avión [" + this.getNombre() + "] girando a la izquierda");
        for (IAvion avion : lstAviones) {
            avion.girarIzquierda();
        }
    }
}