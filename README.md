# Sistema de Gestión de Contenido Audiovisual

## Descripción del Proyecto

Este proyecto es una aplicación Java desarrollada para gestionar un catálogo de contenido audiovisual (películas, series, documentales, etc.). El sistema está diseñado para cumplir con una serie de objetivos de ingeniería de software, incluyendo la aplicación de principios SOLID, el patrón MVC, el uso de código limpio y la implementación de pruebas unitarias.

---

## 1. Requerimientos del Proyecto y Su Implementación

### a) Manejo de Archivos

Se ha implementado una funcionalidad robusta para la persistencia de datos. El sistema es capaz de:

* **Lectura de Archivos:** Leer y parsear datos desde un archivo `contenidos.csv` para inicializar los objetos `ContenidoAudiovisual` y sus subclases.
* **Escritura de Archivos:** Guardar el estado actual del sistema (la lista de contenidos) de vuelta al archivo CSV.
* **Manejo de Excepciones:** Se ha incluido un manejo de excepciones para `IOException` y `FileNotFoundException`, garantizando que el programa pueda gestionar errores de I/O de forma controlada y segura.

### b) Refactorización y Código Limpio

El código ha sido refactorizado para mejorar su calidad y mantenibilidad:

* **Nombres Claros:** Todas las clases, métodos y variables utilizan nombres descriptivos que reflejan su propósito, como `ContentService` y `mostrarDetalles()`.
* **Métodos Modulares:** Se refactorizaron los métodos `mostrarDetalles()` para que cada uno construya y devuelva un `String` formateado, en lugar de imprimir directamente en la consola. Esto hace que el código sea más modular y flexible.
* **Eliminación de Código Redundante:** Se corrigieron errores en los constructores de las clases `Cortometraje`, `Podcast` y `SerieDeTV`, eliminando parámetros no utilizados e inicializando variables de forma consistente.

### c) Principios SOLID

El diseño del proyecto está basado en los principios SOLID para asegurar su escalabilidad y flexibilidad:

* **SRP (Single Responsibility Principle):** Cada clase tiene una responsabilidad única. Por ejemplo, `ContentService` maneja la lógica de negocio, `ConsoleView` se encarga de la interfaz de usuario, y `CsvFileHandler` gestiona la persistencia de datos.
* **OCP (Open/Closed Principle):** La jerarquía de `ContenidoAudiovisual` permite agregar nuevos tipos de contenido extendiendo la clase base, sin modificar el código de las clases existentes.
* **LSP (Liskov Substitution Principle):** Las subclases de `ContenidoAudiovisual` pueden ser utilizadas de manera intercambiable, ya que todas cumplen con el contrato de la clase base.
* **DIP (Dependency Inversion Principle):** El `ContentService` depende de la abstracción `IFileHandler`, lo que permite cambiar la implementación de la persistencia sin modificar la lógica del servicio.

### d) Patrón de Diseño MVC

La arquitectura del sistema sigue el patrón de diseño Modelo-Vista-Controlador:

* **Modelo:** Las clases del paquete `uni1a` (`Pelicula`, `SerieDeTV`, etc.) representan el estado y la lógica de los datos.
* **Vista:** La clase `ConsoleView` es la interfaz de usuario, encargada de mostrar la información y capturar la entrada del usuario.
* **Controlador:** La clase `ContentService` actúa como el controlador, coordinando la interacción entre el Modelo y la Vista.

### e) Pruebas Unitarias

Se desarrollaron pruebas unitarias para asegurar la calidad y fiabilidad del código:

* **JUnit y Mockito:** Se utilizó JUnit 5 para el framework de pruebas y Mockito para simular objetos y aislar la lógica de negocio.
* **Cobertura:** Las pruebas cubren las funcionalidades clave del `ContentService` (como la carga de datos), validando su comportamiento sin depender del sistema de archivos real.

---

## 2. Cómo Clonar y Ejecutar el Proyecto

### Requisitos Previos

* Java Development Kit (JDK) 16 o superior.
* Un IDE como IntelliJ IDEA.

### Pasos para la Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone <URL_DEL_REPOSITORIO>
    ```

2.  **Abrir el proyecto en IntelliJ IDEA:**
    * Selecciona `Open` y elige la carpeta del proyecto.

3.  **Configurar el JDK:**
    * Ve a `File` -> `Project Structure` y configura el `SDK` a una versión compatible.

4.  **Ejecutar la aplicación:**
    * Abre la clase `MainController.java` y ejecuta el método `main()`.

---

## 3. Cómo Ejecutar las Pruebas Unitarias

Para ejecutar las pruebas del proyecto:

1.  **Añadir las librerías necesarias:**
    * Asegúrate de que las siguientes dependencias estén en el classpath del proyecto: `junit-jupiter-api`, `junit-jupiter-engine`, `mockito-core`, `byte-buddy`, `byte-buddy-agent` y `objenesis`.

2.  **Ejecutar las pruebas en IntelliJ IDEA:**
    * Navega a la clase `ContentServiceTest.java` en la carpeta `test`.
    * Haz clic en el botón de "Play" (verde) junto a la clase para ejecutar todas las pruebas.
