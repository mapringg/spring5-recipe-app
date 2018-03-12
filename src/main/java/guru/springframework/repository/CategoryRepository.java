package guru.springframework.repository;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mapring
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
