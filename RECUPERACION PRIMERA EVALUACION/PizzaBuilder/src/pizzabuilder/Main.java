/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilder;

/**
 *
 * @author soyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CocinaDirectora cocina = CocinaDirectora.getInstance();
        
        
        PizzaBuilder pizzabarbacoa= Pizza_Factory.getIntance(Pizza_Factory.PIZZA_BARBACOA); /*CREAMOS UN BUILDER PARA LA PIZZA DE BARBACOA, Y LE DECIMOS QUE VAYA AL FACTORY PARA QUE ELIJA LA PIZZA QUE VAMOS A CREAR*/
        PizzaBuilder pizzajamon= Pizza_Factory.getIntance(Pizza_Factory.PIZZA_JAMONYORK);
        
        cocina.setPizzaBuilder(pizzabarbacoa);
        cocina.construirPizza();
        
        cocina.setPizzaBuilder(pizzajamon);
        cocina.construirPizza();
        
    }
    
}
