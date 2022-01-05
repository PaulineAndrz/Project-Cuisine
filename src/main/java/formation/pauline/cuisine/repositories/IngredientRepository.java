package formation.pauline.cuisine.repositories;

import formation.pauline.cuisine.models.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {
}
