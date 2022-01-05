package formation.pauline.cuisine.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Recette {
    @Id
    private String id;

    private String nom;
    private String description;
    private String auteur;

    private List<QuantiteIngredient> ingredients = new ArrayList<>();
    private List<Etape> etapes = new ArrayList<>();

}
