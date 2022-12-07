package praktikum;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    IngredientType ingredientType = IngredientType.SAUCE;

    @Test
    public void shouldGetName() {
        Ingredient ingredient = new Ingredient(ingredientType, "white bun", 200);
        String expectedName = "white bun";
        String actualName = ingredient.getName();
        assertEquals("Name ingredient is incorrect", expectedName, actualName);

    }

    @Test
    public void shouldGetPrice() {
        Ingredient ingredient = new Ingredient(ingredientType, "red bun", 300);
        float expectedPrice = 300;
        float actualPrice = ingredient.getPrice();
        assertEquals("Price ingredient is incorrect", expectedPrice, actualPrice, 0);

    }

    @Test
    public void shouldGetType() {
        Ingredient ingredient = new Ingredient(ingredientType, "white bun", 200);
        IngredientType expectedType = IngredientType.SAUCE;
        IngredientType actualType = ingredient.getType();
        assertEquals("Type ingredient is incorrect", expectedType, actualType);
    }

}
