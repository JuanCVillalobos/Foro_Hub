*** Foro Hub: **
Foro Hub es una aplicación web de foro desarrollada con Spring Boot, diseñada para gestionar tópicos de discusión. Esta aplicación incluye funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar) y utiliza JWT para autenticación y autorización.

**Características: **
•	CRUD: Crear, leer, actualizar y eliminar tópicos.
•	Autenticación y Autorización: Implementada con JWT.
•	Validaciones: Validaciones de entrada de datos utilizando Jakarta Bean Validation.
•	Swagger: Documentación de la API generada automáticamente.

**Uso de la API: **

Para autenticarte, envía una solicitud POST a /login con las credenciales del usuario. Esto devolverá un token JWT que debe incluirse en el encabezado de autorización para todas las solicitudes posteriores.

**Funciones Principales**
•	POST /topicos: Crea un nuevo tópico.
•	GET /topicos: Obtiene la lista de tópicos.
•	PUT /topicos: Actualiza un tópico existente.
•	DELETE /topicos: Elimina un tópico de la base de datos.


