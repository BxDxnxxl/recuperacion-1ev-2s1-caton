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
public class CocinaDirectora {
    private static CocinaDirectora cocina;
    
    /*en caso de que no haya una cocina creada. crear una nueva*/
    
    public static CocinaDirectora getInstance(){
        if (cocina==null){
            cocina = new CocinaDirectora();
        }
        return cocina;
    }
    
    private PizzaBuilder pizzaBuilder;
    
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }
    
    /*la cocina manda crear una pizza*/
    
    public void construirPizza(){
        this.pizzaBuilder.crearNuevaPizza();
        this.pizzaBuilder.buildMasa();
        this.pizzaBuilder.buildSalsa();
        this.pizzaBuilder.buildRelleno();
    }
    
    public Pizza getPizza(){
        return this.pizzaBuilder.getPizza();
    }
}
