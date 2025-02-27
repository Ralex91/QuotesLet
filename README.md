# QuoteLet 🥩🧸

## Prérequis

Avant de lancer le projet, assurez-vous de configurer correctement les paramètres de connexion dans les fichiers `application.properties` des deux applications Spring.

## Configuration

La configuration doit être faite dans **deux applications distinctes** :

1. Application API

   - Ouvrez le fichier `application.properties` dans le dossier de l'API
   - Configurez les informations de connexion à la base de données
   - Le port par défaut est `8081`

2. Application principale
   - Ouvrez le fichier `application.properties` dans le dossier de l'application principale
   - Configurez les informations de connexion à la base de données
   - Le port par défaut est `8082`

## Ports par défaut

Le projet utilise les ports suivants par défaut :

- API: `8081`
- Application principale: `8082`
