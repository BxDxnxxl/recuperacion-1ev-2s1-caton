
package patron_adapter;


public class Ordenador implements Conectable{
    private boolean encendido;
    
    @Override
    public boolean isEncendida(){
        return this.encendido;
    }
    @Override
    public void encender(){
        this.encendido = true;
    }
    @Override
    public void apagar(){
        this.encendido = false;
    }
}
