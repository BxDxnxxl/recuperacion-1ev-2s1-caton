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
public class BarbacoaPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("Rellena de queso de cabra");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("Barbacoa");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("carne picada, bacon, cebolla");
    }
    
}
