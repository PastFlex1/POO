package uni1a;

public class Actor {
    private String nombre;
    private String fechaNacimiento; // Considerar usar java.time.LocalDate para una mejor gestión de fechas
    private String nacionalidad;

    public Actor(String nombre, String fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Actor: " + nombre + " (Nacimiento: " + fechaNacimiento + ", Nacionalidad: " + nacionalidad + ")";
    }
}