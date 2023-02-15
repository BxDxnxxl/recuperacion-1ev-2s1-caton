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
public class JamonYorkPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        super.pizza.setMasa("gorda");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("queso");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("jamon y queso");
    }
    
}
