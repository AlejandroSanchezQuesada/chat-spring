# Chat-Spring

Chat-Spring es una aplicación de chat basada en web desarrollada en Spring Boot que utiliza JPA y WebSockets para permitir a los usuarios comunicarse entre sí. La aplicación cuenta con una sala general y salas generales para que los usuarios chateen entre ellos.
Requisitos

    Java 8 o superior
    Maven

## Configuración

Antes de ejecutar la aplicación, asegúrate de configurar los siguientes parámetros:

    spring.datasource.url: La URL de la base de datos que se utilizará.
    spring.datasource.username: El nombre de usuario para acceder a la base de datos.
    spring.datasource.password: La contraseña del usuario para acceder a la base de datos.

## Ejecución

Para ejecutar la aplicación, sigue estos pasos:

    Clona el repositorio de GitHub.
    Abre una terminal en la carpeta del repositorio clonado.
    Ejecuta el comando mvn spring-boot:run.

Una vez que la aplicación esté en ejecución, podrás acceder a ella a través de un navegador web en la dirección http://localhost:8080.
Funcionamiento

La aplicación permite a los usuarios registrarse y luego acceder a la sala general o a cualquiera de las salas privadas disponibles. Los usuarios pueden enviar mensajes a la sala y ver los mensajes enviados por otros usuarios.

La aplicación utiliza WebSockets para permitir la comunicación en tiempo real entre los usuarios. Cuando un usuario envía un mensaje, se transmite a todos los usuarios en la sala en cuestión a través de un canal WebSocket.

La aplicación también utiliza JPA para almacenar los usuarios, las salas y los mensajes en una base de datos relacional. Los usuarios pueden ver los mensajes enviados anteriormente cuando ingresan a una sala.
Desarrollo

La aplicación se encuentra en desarrollo activo y se agregarán nuevas funcionalidades en el futuro. Por favor, consulta la documentación del código para obtener más información sobre cómo contribuir al proyecto.
