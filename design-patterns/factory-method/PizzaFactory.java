public class PizzaFactory {

    public static Pizza createPizza(PizzaType broadbandType) {
        switch (broadbandType) {
            case SPICY_CHEESE_PIZZA: return new SpicyCheesePizza();
            case CHEESY_CHICKEN_PIZZA: return new CheesyChickenPizza();
            default: return null;
        }
    }

}
