# Utiliza una imagen de Java como base
FROM openjdk:11-jdk

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos del backend en el contenedor
COPY ./target/*.jar app.jar

# Puerto que escucha el backend
EXPOSE 8080

# Comando para ejecutar el backend
CMD ["java", "-jar", "app.jar"]
