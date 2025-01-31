# 🌟 API de Gestión de Artículos 🌟

🎉 Esta API te permite agregar, editar y borrar artículos en una base de datos PostgreSQL. Está construida usando **Java**, **Spring Boot** y **Hibernate**, proporcionando una solución eficiente, moderna y escalable para la gestión de contenidos.

## 🚀 Tecnologías Usadas

- **Java**: El lenguaje de programación utilizado.

- **Spring Boot**: Framework que simplifica el desarrollo de aplicaciones Java.

- **Hibernate**: ORM (Object-Relational Mapping) para interactuar con la base de datos PostgreSQL.

## 💡 Funcionalidades

- **Agregar artículo**: Crea un nuevo artículo en la base de datos.

- **Editar artículo**: Actualiza los datos de un artículo existente.

- **Borrar artículo**: Elimina un artículo de la base de datos.

## 🔧 Instalación

Para instalar y ejecutar el proyecto en tu máquina local, sigue estos pasos:

1. **Clona el repositorio**:

    ```bash
    git clone https://github.com/NicoPastorini1/CRUD-Backend-Java
    ```

2. **Navega a la carpeta del proyecto**:

    ```bash
    cd CRUD-Backend-Java
    ```

3. **Configura la base de datos PostgreSQL**:

    - Asegúrate de tener PostgreSQL instalado y en ejecución.
    - Crea una base de datos para la API.
    - Modifica el archivo `application.properties` con tus credenciales de PostgreSQL: <br>
    <br>
    
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base_de_datos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    ```

4. **Compila y ejecuta el proyecto**:

    ```bash
    mvn spring-boot:run
    ```

## 🛠️ Endpoints Disponibles

- **POST /api/productos**: Agrega un nuevo artículo.

- **PUT /api/productos/{id}**: Edita un artículo existente.

- **DELETE /api/productos/{id}**: Elimina un artículo por su ID.


---
✨😊
