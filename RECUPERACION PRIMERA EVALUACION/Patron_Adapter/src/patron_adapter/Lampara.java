
package patron_adapter;


public class Lampara implements Conectable{
    private boolean encendida;
    
    
    /*devolvera si esta encendida o apaga en true or false*/
    @Override
    public boolean isEncendida(){
        return this.encendida;   
    }
    @Override
    public void encender(){
        this.encendida = true;
    }
    @Override
    public void apagar(){
        this.encendida = false;
    }
}
