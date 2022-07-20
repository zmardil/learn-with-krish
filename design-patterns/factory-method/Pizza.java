import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected List<Ingredient> ingredients = new ArrayList<>();

    public Pizza() {
        createPizza();
    }

    public abstract void createPizza();

    @Override
    public String toString() {
        return "Pizza{Ingredients: " + ingredients + "}";
    }
}
