package poo;

import uni1a.*; // Importa todas las clases del paquete uni1a
import java.util.ArrayList; // Necesario para List
import java.util.List;     // Necesario para List

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("--- Inicio del Sistema de Gestión de Contenido Audiovisual ---");
        System.out.println();

        // 1. Crear instancias de Pelicula y asociar Actores
        System.out.println("--- Creando Películas y asignando Actores ---");
        Pelicula peli1 = new Pelicula("Interstellar", 169, "Ciencia Ficción", "Paramount Pictures");
        Actor actor1 = new Actor("Matthew McConaughey", "04-11-1969", "Estadounidense");
        Actor actor2 = new Actor("Anne Hathaway", "12-11-1982", "Estadounidense");
        peli1.agregarActor(actor1);
        peli1.agregarActor(actor2);

        Pelicula peli2 = new Pelicula("La La Land", 128, "Musical", "Lionsgate Films");
        Actor actor3 = new Actor("Ryan Gosling", "12-11-1980", "Canadiense");
        Actor actor4 = new Actor("Emma Stone", "06-11-1988", "Estadounidense");
        peli2.agregarActor(actor3);
        peli2.agregarActor(actor4);
        System.out.println("Películas creadas y actores asignados.");
        System.out.println();

        // 2. Crear instancias de SerieDeTV y asociar Temporadas
        System.out.println("--- Creando Series de TV y asignando Temporadas ---");
        SerieDeTV serie1 = new SerieDeTV("Breaking Bad", 50, "Drama Criminal"); // Constructor modificado
        Temporada temp1 = new Temporada(1, 7, 2008);
        Temporada temp2 = new Temporada(2, 13, 2009);
        Temporada temp3 = new Temporada(3, 10, 2010);
        serie1.agregarTemporada(temp1);
        serie1.agregarTemporada(temp2);
        serie1.agregarTemporada(temp3);

        SerieDeTV serie2 = new SerieDeTV("Stranger Things", 50, "Ciencia Ficción"); // Constructor modificado
        Temporada temp4 = new Temporada(1, 8, 2016);
        Temporada temp5 = new Temporada(2, 9, 2017);
        serie2.agregarTemporada(temp4);
        serie2.agregarTemporada(temp5);
        System.out.println("Series de TV creadas y temporadas asignadas.");
        System.out.println();

        // 3. Crear instancias de Documental y asociar Investigadores
        System.out.println("--- Creando Documentales y asignando Investigadores ---");
        Documental doc1 = new Documental("Nuestro Planeta", 60, "Naturaleza", "Biodiversidad");
        Investigador inv1 = new Investigador("David Attenborough", "Historia Natural", "BBC Earth");
        Investigador inv2 = new Investigador("Jane Goodall", "Primatología", "Jane Goodall Institute");
        doc1.agregarInvestigador(inv1);
        doc1.agregarInvestigador(inv2);
        System.out.println("Documentales creados y investigadores asignados.");
        System.out.println();

        // 4. Crear instancias de VideoYouTube y Cortometraje
        System.out.println("--- Creando Videos de YouTube y Cortometrajes ---");
        VideoYouTube youtubeVideo = new VideoYouTube("Cómo programar en Java - Guía para Principiantes", 15, "Educación", "Programación Fácil", "https://www.youtube.com/watch?v=ejemplo123");
        youtubeVideo.reproducir();
        youtubeVideo.reproducir();
        youtubeVideo.darMeGusta();
        youtubeVideo.comentar("¡Excelente tutorial, muy claro!");

        Cortometraje corto1 = new Cortometraje("El Héroe Silencioso", 10, "Drama", "Festival de Cine Independiente de Sundance");
        corto1.participarEnFestival("Festival Internacional de Cortometrajes de Clermont-Ferrand");
        corto1.anunciarPremio();
        corto1.anunciarPremio(); // Gana un segundo premio
        System.out.println("Videos de YouTube y Cortometrajes creados y probados.");
        System.out.println();


        // 5. Mostrar detalles de todos los contenidos audiovisuales creados
        System.out.println("--- Mostrando Detalles de Todos los Contenidos ---");
        List<ContenidoAudiovisual> todosLosContenidos = new ArrayList<>();
        todosLosContenidos.add(peli1);
        todosLosContenidos.add(peli2);
        todosLosContenidos.add(serie1);
        todosLosContenidos.add(serie2);
        todosLosContenidos.add(doc1);
        todosLosContenidos.add(youtubeVideo);
        todosLosContenidos.add(corto1);

        for (ContenidoAudiovisual contenido : todosLosContenidos) {
            contenido.mostrarDetalles(); // Demostración de polimorfismo
        }

        System.out.println("--- Fin del Sistema ---");
    }
}