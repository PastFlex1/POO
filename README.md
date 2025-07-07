## Instrucciones de Instalación y Uso

Para clonar y ejecutar este proyecto en tu entorno local Eclipse:

1.  **Requisitos:**
    * Java Development Kit (JDK) 11 o superior.
    * Eclipse IDE (con el plugin EGit instalado).

2.  **Clonar el Repositorio:**
    * Abre Eclipse.
    * Ve a `File > Import... > Git > Projects from Git`.
    * Selecciona `Clone URI`.
    * En el campo `URI`, pega la URL de este repositorio: `[Tu URL de Repositorio en GitHub]`
    * Sigue los pasos, asegurándote de seleccionar la rama `main` (o `master`).
    * Cuando te pregunte cómo importar los proyectos (si no los detecta automáticamente), selecciona `Import as general project` y luego, una vez importado, haz clic derecho sobre el proyecto en el `Project Explorer > Configure > Convert to Java Project`. Asegúrate de que el "Java Build Path" incluya la carpeta `src/main/java` y la "JRE System Library" adecuada.

3.  **Ejecutar la Aplicación:**
    * Navega hasta la clase `PruebaAudioVisual.java` en el `Package Explorer` (ubicada en `src/main/java/poo/`).
    * Haz clic derecho sobre `PruebaAudioVisual.java`.
    * Selecciona `Run As > Java Application`.
    * La salida detallada de la creación y manipulación de los objetos de contenido audiovisual se mostrará en la consola de Eclipse.

## Mejoras Adicionales Implementadas (Ejemplos, si aplicó)

* **Comentarios en Código:** Se han añadido comentarios explicativos en el código para mejorar la legibilidad y comprensión.
* **Uso de Listas Genéricas:** Las relaciones se implementan con `java.util.List` y `java.util.ArrayList`, promoviendo buenas prácticas de POO.
* **Métodos `toString()`:** Implementación de métodos `toString()` en las clases `Actor`, `Temporada`, e `Investigador` para facilitar la impresión de sus detalles.
* **Limpieza de Código:** Se ha prestado atención a la limpieza y formato del código para mantenerlo consistente y legible.
