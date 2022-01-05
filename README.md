# Projet Cuisine

Créer une API REST avec Spring Boot Web et MongoDB pour la gestion de recette:
* une recette possède un nom, une description, possède un auteur des ingrédients avec leurs quantités et des étapes
* Un ingrédient possède un nom et une unité
* Une étape possède un numéro, une description et une durée. Il n'y a pas de route pour les étapes, elles font partie de la recette.

## Prérequis
1. Un IDE JAVA
2. JDK 11+
3. Docker

## Utilisation

Une fois le projet importer dans votre IDE :

1. Ouvrer un terminal à la racine du projet et taper la commande suivante pour lancer la base de données via Docker :
```shell script
docker compose up -d
```

2. Puis, utiliser la commande suivante dans votre IDE pour lancer le projet avec maven :
```shell script
mvnw spring-boot:run
```