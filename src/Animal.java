import java.util.ArrayList;

public class Animal {
    private String nombre;
    private String especie;
    private String raza;
    private Cliente propietario;
    private ArrayList<Consulta> historialConsultas;

    public Animal(String nombre, String especie, String raza, Cliente propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.propietario = propietario;
        this.historialConsultas = new ArrayList<>();
    }

    //TODO: Completar agregar consulta al historial de consulta 
    public void agregarConsulta(Consulta consulta) {
        historialConsultas.add(consulta);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Consulta> getHistorialConsultas() {
        return historialConsultas;
    }

    public void setHistorialConsultas(ArrayList<Consulta> historialConsultas) {
        this.historialConsultas = historialConsultas;
    }
}
