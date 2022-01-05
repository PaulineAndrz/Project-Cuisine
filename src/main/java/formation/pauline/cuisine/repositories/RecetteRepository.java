package formation.pauline.cuisine.repositories;

import formation.pauline.cuisine.models.Recette;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecetteRepository extends MongoRepository<Recette, String> {
}
