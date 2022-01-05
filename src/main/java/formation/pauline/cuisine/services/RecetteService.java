package formation.pauline.cuisine.services;

import formation.pauline.cuisine.models.Recette;
import formation.pauline.cuisine.repositories.RecetteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RecetteService {

    private RecetteRepository recetteRepository;

    public RecetteService(RecetteRepository recetteRepository) {
        this.recetteRepository = recetteRepository;
    }

    /**
     * Méthode retournant la liste de toutes les recettes
     * @return les recettes sauvegardées
     */
    public List<Recette> findAll() {
        return recetteRepository.findAll();
    }

    /**
     * Sauvegarde une nouvelle recette si entity n'a pas déjà un id
     * @param entity recette à sauvegarder
     * @return l'entité avec un nouveau id
     */
    public Recette insert(Recette entity) {
        return recetteRepository.insert(entity);
    }

    /**
     * Sauvegarde ou met à jour une recette
     * Sauvegarde la recette si celle-ci ne possède pas encore d'id (@see: RecetteService::insert)
     * Sinon, remplace la valeur sauvegardée par la nouvelle valeur
     * @param entity nouvelle recette ou recette à mettre à jour
     * @return l'entité identique à la version sauvegardée
     */
    public Recette save(Recette entity) {
        return recetteRepository.save(entity);
    }

    /**
     * Recherche une recette en fonction de son id
     * Si l'id n'est pas valide, retourne un status 404
     * @param id id de la recette à rechercher
     * @return la recette possédant cette id
     */
    public Recette findById(String id) {
        return recetteRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "La recette avec l'id "+id+" n'existe pas"));
    }

    /**
     * Supprime une recette existante en fonction de son id
     * @param id id de la recette à supprimer
     */
    public void deleteById(String id) {
        recetteRepository.deleteById(id);
    }
}
