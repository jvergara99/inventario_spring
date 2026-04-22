# Etapa 1: Build con Gradle (Compilación)
FROM gradle:8.10-jdk17 AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew
RUN ./gradlew build -x test --no-daemon

# Etapa 2: Imagen ligera de runtime (Producción)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copiamos solo el .jar generado en la etapa anterior
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
