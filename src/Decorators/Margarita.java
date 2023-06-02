package Decorators;

import Pizza.BasePizza;

public class Margarita extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
