package formation.pauline.cuisine.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Etape {
    private Integer numero;
    private String description;
    private Integer duree;
}
