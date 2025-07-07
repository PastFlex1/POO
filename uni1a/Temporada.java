package uni1a;

// No necesita importar List o ArrayList si solo representa una sola temporada
// y no contiene una lista de episodios directamente.

public class Temporada {
    private int numeroTemporada;
    private int cantidadEpisodios;
    private int anioLanzamiento;

    public Temporada(int numeroTemporada, int cantidadEpisodios, int anioLanzamiento) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
        this.anioLanzamiento = anioLanzamiento;
    }

    // Getters
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    // Setters
    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Temporada " + numeroTemporada + " (" + cantidadEpisodios + " episodios, " + anioLanzamiento + ")";
    }
}