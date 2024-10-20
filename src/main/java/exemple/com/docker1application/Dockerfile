FROM adoptopenjdk:17-jre-hotspot

# Créer un volume temporaire
VOLUME /tmp

# Ajouter le fichier JAR à l'image
ADD target/*.jar app.jar

# Commande pour exécuter l'application
CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]

# Exposer le port 8080
EXPOSE 8080
