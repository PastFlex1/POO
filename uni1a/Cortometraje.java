package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String festivalPresentacion;
    private int premiosObtenidos;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String festivalPresentacion) {
        super(titulo, duracionEnMinutos, genero);
        this.festivalPresentacion = festivalPresentacion;
        this.premiosObtenidos = 0; // Inicialmente sin premios
    }

    // Getters
    public String getFestivalPresentacion() {
        return festivalPresentacion;
    }

    public int getPremiosObtenidos() {
        return premiosObtenidos;
    }

    // Setters
    public void setFestivalPresentacion(String festivalPresentacion) {
        this.festivalPresentacion = festivalPresentacion;
    }

    public void setPremiosObtenidos(int premiosObtenidos) {
        this.premiosObtenidos = premiosObtenidos;
    }

    // Métodos específicos
    public void participarEnFestival(String festival) {
        this.festivalPresentacion = festival; // Actualiza el festival si cambia
        System.out.println(getTitulo() + " está participando en el festival: " + festival);
    }

    public void anunciarPremio() {
        this.premiosObtenidos++;
        System.out.println("¡Felicidades! " + getTitulo() + " ha ganado un premio. Total de premios: " + premiosObtenidos);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Cortometraje ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Presentado en Festival: " + festivalPresentacion);
        System.out.println("Premios Obtenidos: " + premiosObtenidos);
        System.out.println();
    }
}