package htw.berlin.wi.prog2.domain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrecomputedSandwich implements Sandwich {

    private final BigDecimal price;
    private final int calories;
    private final List<String> ingredientNames;

    public PrecomputedSandwich(BigDecimal price, int calories, List<String> ingredientNames) {
        this.price = price;
        this.calories = calories;
        this.ingredientNames = Collections.unmodifiableList(ingredientNames);
    }

    @Override
    public BigDecimal calculatePrice() {
        return price;
    }

    @Override
    public int calculateCalories() {
        return calories;
    }

    @Override
    public List<String> getIngredientNames() {
        return ingredientNames;
    }
}
