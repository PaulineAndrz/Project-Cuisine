package formation.pauline.cuisine.controllers;

import formation.pauline.cuisine.models.Ingredient;
import formation.pauline.cuisine.services.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ingredient")
@CrossOrigin
public class IngredientController {

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("")
    public List<Ingredient> findAll() {
        return ingredientService.findAll();
    }

    @PostMapping("")
    public Ingredient insert(@RequestBody Ingredient entity) {
        return ingredientService.insert(entity);
    }

    @PutMapping("")
    public Ingredient save(@RequestBody Ingredient entity) {
        return ingredientService.save(entity);
    }

    @GetMapping("{id}")
    public Ingredient findById(@PathVariable String id) {
        return ingredientService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        ingredientService.deleteById(id);
    }
}
