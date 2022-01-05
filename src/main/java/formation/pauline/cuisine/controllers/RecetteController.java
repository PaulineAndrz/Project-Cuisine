package formation.pauline.cuisine.controllers;

import formation.pauline.cuisine.models.Recette;
import formation.pauline.cuisine.services.RecetteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recette")
@CrossOrigin
public class RecetteController {

    private RecetteService recetteService;

    public RecetteController(RecetteService recetteService) {
        this.recetteService = recetteService;
    }

    @GetMapping("")
    public List<Recette> findAll() {
        return recetteService.findAll();
    }

    @PostMapping("")
    public Recette insert(@RequestBody Recette entity) {
        return recetteService.insert(entity);
    }

    @PutMapping("")
    public Recette save(@RequestBody Recette entity) {
        return recetteService.save(entity);
    }

    @GetMapping("{id}")
    public Recette findById(@PathVariable String id) {
        return recetteService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        recetteService.deleteById(id);
    }
}
