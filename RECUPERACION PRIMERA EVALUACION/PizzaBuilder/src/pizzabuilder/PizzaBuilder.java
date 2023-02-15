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
public abstract class PizzaBuilder {

    public Pizza pizza; 

    public void crearNuevaPizza(){
        this.pizza = new Pizza();
    }
    
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    /*crear una pizza*/
    
    public void  nuevaPizza(){
        this.pizza= new Pizza();
    }
    
    /*metodos que heredaran todas las clases de pizza*/
    
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
