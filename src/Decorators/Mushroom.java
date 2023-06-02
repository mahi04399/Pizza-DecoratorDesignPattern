package Decorators;

import Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;
    public Mushroom (BasePizza basePizza) {
        this.basePizza = basePizza;
        System.out.println("Mushrooms added");
    }

    @Override
    public int cost() {
        return basePizza.cost() + 40;
    }
}
