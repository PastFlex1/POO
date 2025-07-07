package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private String url;
    private long vistas;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, String url) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.url = url;
        this.vistas = 0; // Se inicializa con 0 vistas al crear
    }

    // Getters
    public String getCanal() {
        return canal;
    }

    public String getUrl() {
        return url;
    }

    public long getVistas() {
        return vistas;
    }

    // Setters
    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setVistas(long vistas) { // Útil para cargar vistas existentes, aunque reproducir las incrementa.
        this.vistas = vistas;
    }

    // Métodos específicos
    public void reproducir() {
        this.vistas++; // Incrementa vistas cada vez que se "reproduce"
        System.out.println("Reproduciendo " + getTitulo() + " del canal " + canal + ". Vistas actuales: " + vistas);
    }

    public void comentar(String comentario) {
        System.out.println("Nuevo comentario en el video '" + getTitulo() + "': \"" + comentario + "\"");
    }

    public void darMeGusta() {
        System.out.println("¡A '" + getTitulo() + "' le han dado un Me Gusta!");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Video de YouTube ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("URL: " + url);
        System.out.println("Vistas: " + vistas);
        System.out.println();
    }
}