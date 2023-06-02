package Pizza;

import Decorators.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese (BasePizza basePizza) {
        this.basePizza = basePizza;
        System.out.println("Pizza.ExtraCheese added");
    }
    @Override
    public int cost() {
        return basePizza.cost() + 60;
    }
}
