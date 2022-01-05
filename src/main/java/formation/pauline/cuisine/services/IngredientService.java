package formation.pauline.cuisine.services;

import formation.pauline.cuisine.models.Ingredient;
import formation.pauline.cuisine.repositories.IngredientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    private IngredientRepository ingredientRepository;


    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    /**
     * Méthode retournant la liste de touts les ingredients
     * @return les ingredients sauvegardés
     */
    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    /**
     * Sauvegarde un nouvel ingredient si entity n'a pas déjà un id
     * @param entity ingredient à sauvegarder
     * @return l'entité avec un nouveau id
     */
    public Ingredient insert(Ingredient entity) {
        return ingredientRepository.insert(entity);
    }

    /**
     * Sauvegarde ou met à jour un ingredient
     * Sauvegarde l'ingredient si celui-ci ne possède pas encore d'id (@see: IngredientService::insert)
     * Sinon, remplace la valeur sauvegardée par la nouvelle valeur
     * @param entity nouvel ingredient ou ingredient à mettre à jour
     * @return l'entité identique à la version sauvegardée
     */
    public Ingredient save(Ingredient entity) {
        return ingredientRepository.save(entity);
    }

    /**
     * Recherche un ingredient en fonction de son id
     * Si l'id n'est pas valide, retourne un status 404
     * @param id id de l'ingredient à rechercher
     * @return l'ingredient possédant cette id
     */
    public Ingredient findById(String id) {
        return ingredientRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "L'ingredient avec l'id "+id+" n'existe pas"));
    }

    /**
     * Supprime un ingredient existant en fonction de son id
     * @param id id de l'ingredient à supprimer
     */
    public void deleteById(String id) {
        ingredientRepository.deleteById(id);
    }
}
