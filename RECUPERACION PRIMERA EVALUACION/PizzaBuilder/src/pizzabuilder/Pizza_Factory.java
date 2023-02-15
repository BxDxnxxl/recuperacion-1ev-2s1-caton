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
public class Pizza_Factory {
    public final static int PIZZA_BARBACOA=1;
    public final static int PIZZA_JAMONYORK=2;
    
    public static PizzaBuilder getIntance(int pizzaSelected){
        PizzaBuilder pizza= null;
        switch(pizzaSelected){
            case PIZZA_BARBACOA:
                pizza=new BarbacoaPizzaBuilder();
                break;
            
            case PIZZA_JAMONYORK:
                pizza= new JamonYorkPizzaBuilder();
                break;
                
        }
        return pizza;
    }
}
