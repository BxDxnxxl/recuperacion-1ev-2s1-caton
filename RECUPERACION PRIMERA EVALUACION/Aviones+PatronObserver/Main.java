public class Main {
    
    public static void main(String[] args) {
    
        AvionLider avionLider = new AvionLider("Avión Lider");


        AvionPerseguidor avionPerseguidor1 = new AvionPerseguidor("Boeing 747");
        AvionPerseguidor avionPerseguidor2 = new AvionPerseguidor("Airbus A380");
        AvionPerseguidor avionPerseguidor3 = new AvionPerseguidor("B-52");
        avionLider.anadirAvion(avionPerseguidor1);
        avionLider.anadirAvion(avionPerseguidor2);
        avionLider.anadirAvion(avionPerseguidor3);

        avionLider.start();
    }
}