package practica5to;

public class Estudiante {

    private String dni;
    private String nombreMateria;
    private Double nota;
    private String paralelo;

    public Estudiante(String dni, String nombreMateria, Double nota, String paralelo) {
        this.dni = dni;
        this.nombreMateria = nombreMateria;
        this.nota = nota;
        this.paralelo = paralelo;
    }

    public Estudiante() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " NOMBRE: " + nombreMateria + " NOTA: " + nota + " PARALELO: " + paralelo;
    }
    

}
