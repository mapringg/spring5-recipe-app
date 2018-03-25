package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by mapring
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
