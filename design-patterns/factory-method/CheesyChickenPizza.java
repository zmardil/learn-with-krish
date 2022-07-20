public class CheesyChickenPizza extends Pizza {

    @Override
    public void createPizza() {
        ingredients.add(new Cheese());
        ingredients.add(new Chicken());
    }
}
