package formation.pauline.cuisine.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class QuantiteIngredient {
    private Integer quantite;
    private Ingredient ingredient;
}
