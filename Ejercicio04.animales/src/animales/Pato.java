
package animales;

/**
 * @author mglar
 */
public class Pato {
      private String nombre;
      private String apodo;
      private Integer edad;

   public Pato() {
   }

   public Pato(String nombre, String apodo, Integer edad) {
      this.nombre = nombre;
      this.apodo = apodo;
      this.edad = edad;
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

   @Override
   public String toString() {
      return "Pato{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + '}';
   }
   
   
}
