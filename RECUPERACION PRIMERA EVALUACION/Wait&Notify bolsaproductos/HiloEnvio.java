public class HiloEnvio extends Thread {
 
    private Bolsa bolsa;
     
    public HiloEnvio(Bolsa bolsa) {
     super();
     this.bolsa = bolsa;
     }
     
    @Override
     public void run() {
     
            /*si la bolsa tiene capacidad de tener mas oroductos, coge la cantidad de productos que hay y la pasa por pantalla */
        
    if (bolsa.estaLlena() != true) {
     
    try {
     synchronized (bolsa) {
     bolsa.wait();
     }
     
     } catch (InterruptedException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
     }
     
     System.out.println("Enviando la bolsa con "+ bolsa.getSize()+"elementos");
     }
     
    }
     
    public Bolsa getBolsa() {
     return bolsa;
     }
     
    public void setBolsa(Bolsa bolsa) {
     this.bolsa = bolsa;
     }
     
    }
