package uni1a;

import java.util.ArrayList; // Necesario para List
import java.util.List;     // Necesario para List

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores; // ¡NUEVO! Lista de objetos Investigador

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>(); // Inicializar la lista en el constructor
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // ¡NUEVO! Método para añadir investigadores
    public void agregarInvestigador(Investigador investigador) {
        if (investigador != null) {
            this.investigadores.add(investigador);
        }
    }

    // ¡NUEVO! Getter para la lista de investigadores
    public List<Investigador> getInvestigadores() {
        return investigadores;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Documental ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores Participantes:");
        if (investigadores.isEmpty()) {
            System.out.println("  No hay investigadores registrados para este documental.");
        } else {
            for (Investigador inv : investigadores) {
                System.out.println("  - " + inv.getNombre() + " (" + inv.getEspecialidad() + ", " + inv.getInstitucion() + ")");
            }
        }
        System.out.println();
    }
}