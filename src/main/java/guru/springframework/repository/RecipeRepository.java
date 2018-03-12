package guru.springframework.repository;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mapring
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
