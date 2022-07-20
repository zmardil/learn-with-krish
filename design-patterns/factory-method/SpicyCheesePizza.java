public class SpicyCheesePizza extends Pizza {
    @Override
    public void createPizza() {
        ingredients.add(new Spice());
        ingredients.add(new Cheese());
    }

}
