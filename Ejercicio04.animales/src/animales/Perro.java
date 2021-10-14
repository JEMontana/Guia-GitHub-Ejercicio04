package animales;

public class Perro {

    private String nombre;
    private String apodo;
    private Integer edad;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String apodo, Integer edad, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
}
