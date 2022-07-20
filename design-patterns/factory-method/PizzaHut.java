public class PizzaHut {
    public static void main(String[] args) {

        Pizza spicyCheesePizza = PizzaFactory.createPizza(PizzaType.SPICY_CHEESE_PIZZA);
        System.out.println(spicyCheesePizza);

        Pizza cheesyChickenPizza = PizzaFactory.createPizza(PizzaType.CHEESY_CHICKEN_PIZZA);
        System.out.println(cheesyChickenPizza);
    }
}
