package uni1a;

import java.util.ArrayList; // Necesario para List
import java.util.List;     // Necesario para List

public class SerieDeTV extends ContenidoAudiovisual {
    // private int temporadas; // ¡MODIFICADO! Este atributo ya no es necesario si manejamos una lista de objetos Temporada
    private List<Temporada> listaTemporadas; // ¡NUEVO! Lista de objetos Temporada

    // ¡MODIFICADO! El constructor ya no recibe 'int temporadas'
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.listaTemporadas = new ArrayList<>(); // Inicializar la lista en el constructor
    }

    // ¡NUEVO! Método para añadir temporadas
    public void agregarTemporada(Temporada temporada) {
        if (temporada != null) {
            this.listaTemporadas.add(temporada);
        }
    }

    // ¡NUEVO! Getter para la lista de temporadas
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    // Opcional: Getter para obtener el número total de temporadas desde la lista
    public int getNumeroTotalTemporadas() {
        return listaTemporadas.size();
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles de la Serie de TV ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número Total de Temporadas: " + getNumeroTotalTemporadas()); // Muestra el tamaño de la lista
        System.out.println("Detalles de las Temporadas:");
        if (listaTemporadas.isEmpty()) {
            System.out.println("  No hay temporadas registradas para esta serie.");
        } else {
            for (Temporada temp : listaTemporadas) {
                System.out.println("  - " + temp.toString()); // Usa el toString de Temporada
            }
        }
        System.out.println();
    }
}