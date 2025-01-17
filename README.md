# Task Management Application (springboot)

![img1](https://github.com/user-attachments/assets/aaafcb83-6aa6-4200-aa93-e7490b370fbf)
## Descripción
La aplicación de gestión de tareas es una herramienta versátil que permite a los usuarios agregar, visualizar y gestionar tareas. Esta aplicación incluye una interfaz gráfica de escritorio en Java (`Swing`) y una aplicación web basada en Spring Boot con Thymeleaf.

## Características
- **Interfaz de Escritorio**: Aplicación Java `Swing` para gestionar tareas localmente.
- **Interfaz Web**: Aplicación web basada en Spring Boot con Thymeleaf para gestionar tareas desde un navegador.
- **Gestión de Etapas**: Permite definir y visualizar el número de etapas para cada tarea.
- **Persistencia de Datos**: Utiliza JPA para almacenar las tareas en una base de datos.

## Instalación

### Prerrequisitos
- Java 17
- Maven 3.8+
- Un navegador web

### Pasos
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/taskmanagement.git
   cd taskmanagement
   ```

   ###Compila y empaqueta la aplicación:
   
   ```bash
   mvn clean package
   ```
   ###Ejecuta la aplicación:

   ```bash
   java -jar target/taskmanagement-0.0.1-SNAPSHOT.jar
   ```
   ###Abre la interfaz gráfica (Swing):

      ```bash
      java -cp target/taskmanagement-0.0.1-SNAPSHOT.jar com.example.taskmanagement.TaskManager
   ```

   Uso
### Interfaz Gráfica (Swing)
Inicia la aplicación TaskManager desde el terminal o línea de comandos.

Agrega una nueva tarea ingresando el título, la descripción, el número de etapas y marcando si está completada.

Las tareas agregadas se mostrarán en la lista con su respectivo número de etapas.


### Interfaz Web
Abre tu navegador web y ve a http://localhost:8080.


Agrega una nueva tarea utilizando el formulario en la página principal.


Visualiza todas las tareas y sus detalles en la misma página.


### Contribuciones
¡Las contribuciones son bienvenidas! Si deseas colaborar con este proyecto, por favor sigue estos pasos:

Haz un fork del repositorio.

Crea una rama (git checkout -b feature/nueva-caracteristica).

Realiza tus cambios y haz commit (git commit -am 'Agrega nueva característica').

Empuja tus cambios a la rama (git push origin feature/nueva-caracteristica).

Abre un Pull Request.

### Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

### Contacto
Desarrollado por Tu Nombre. Si tienes alguna pregunta o sugerencia, ¡no dudes en contactarme!

Disfruta usando la aplicación de gestión de tareas y mantente organizado como nunca antes!
   
