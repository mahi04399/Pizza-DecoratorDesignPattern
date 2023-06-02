import Decorators.Margarita;
import Decorators.Mushroom;
import Pizza.BasePizza;
import Pizza.ExtraCheese;
import Pizza.VeggieDelight;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new VeggieDelight();
        pizza = new Mushroom(new ExtraCheese(pizza));

        BasePizza pizza2 = new Margarita();
        pizza2 = new ExtraCheese(new Mushroom(pizza2));

        System.out.println("Cost :" + pizza.cost());
        System.out.println("Cost :" + pizza2.cost());
    }
}