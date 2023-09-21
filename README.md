# Documentación del Backend - Prueba Tecnica Seguros Pepin Aplicacion de Gestion de Polizas 

## Resumen
El backend de la Aplicación de Gestión de Pólizas es una parte esencial de la aplicación que gestiona la lógica y la interacción con la base de datos. Está construido con Spring Boot, un marco de desarrollo de aplicaciones Java.

## Tecnologías Utilizadas
A continuación, se detallan las tecnologías clave utilizadas en el backend de la aplicación:

### Spring Boot
Spring Boot es un marco de desarrollo de aplicaciones Java que facilita la creación de aplicaciones Java autónomas y basadas en producción. Ofrece un conjunto de herramientas y convenciones que aceleran el desarrollo y simplifican la configuración.

### Spring Framework
Spring Framework es el núcleo de Spring Boot y proporciona funcionalidades esenciales como la inversión de control (IoC) y la gestión de transacciones.

### Spring Data MongoDB
Spring Data MongoDB se utiliza para interactuar con la base de datos MongoDB. Proporciona una capa de abstracción que simplifica la gestión de datos y permite una integración sencilla con MongoDB.

### MongoDB
MongoDB es una base de datos NoSQL ampliamente utilizada que almacena datos en documentos JSON. En esta aplicación, se utiliza para almacenar información relacionada con las pólizas y los vehículos.

### Spring Web
Spring Web se utiliza para crear controladores web que gestionan las solicitudes HTTP entrantes y las respuestas correspondientes. Permite la creación de API RESTful.

## Configuración
A continuación, se describen las configuraciones clave en el backend:

### Puerto del Servidor
El servidor Tomcat integrado en Spring Boot se inicia en el puerto 8080 por defecto con el contexto raíz (''). Esta configuración se puede personalizar si es necesario.

### Base de Datos MongoDB
Se debe configurar la URL de conexión a MongoDB en el archivo de configuración para que la aplicación se comunique correctamente con la base de datos.

## Rutas de la API
El backend de la aplicación proporciona una serie de rutas de API para realizar operaciones CRUD en las pólizas y los vehículos. A continuación, se enumeran las rutas principales:

- Crear Póliza: `POST /api/polizas`
- Obtener Todas las Pólizas: `GET /api/polizas`
- Obtener Póliza por ID: `GET /api/polizas/{id}`
- Actualizar Póliza: `PUT /api/polizas/{id}`
- Eliminar Póliza: `DELETE /api/polizas/{id}`
- Agregar Vehículos a una Póliza: `PUT /api/polizas/{id}/vehiculos`

## Ejecución
Para ejecutar el backend de la aplicación, sigue estos pasos:


1. Navegar al directorio raíz del proyecto backend.
2. Ejecutar `mvn clean install` para construir el proyecto.
3. Ejecutar `mvn spring-boot:run` para iniciar el servidor de desarrollo en el puerto 8080 (o en el puerto especificado en la configuración) con el contexto raíz ('').


## Frontend
Configuración
Ejecución
Navega al directorio raíz del frontend.
Ejecuta npm install para instalar las dependencias.
Ejecuta npm start para iniciar el servidor de desarrollo.
Rutas del Frontend
Inicio: /
Lista de Clientes: /clientes
Agregar Cliente: /add-cliente
Lista de Pólizas: /polizas
Agregar Póliza: /add-poliza

## Desarrollador
- Angel Carrasco


