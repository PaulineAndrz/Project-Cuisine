package formation.pauline.cuisine.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class QuantiteIngredient {

    @Id
    private String id;

    private Integer quantite;
    private Ingredient ingredient;
}
