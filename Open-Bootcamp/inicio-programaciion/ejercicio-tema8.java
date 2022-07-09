/* Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola. */

public Class Main {

  public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setEdad(37);
    Int edad = persona.getEdad();
    System.out.println(edad);

    persona.setNombre('Miguel');
    String nombre = persona.getNombre();
    System.out.println(nombre);
    
    persona.setTelefono(678238974);
    Int telefono = persona.getTelefono();
    System.out.println(telefono);
  }
}

class Persona {

  private int edad;
  private String nombre;
  private int telefono;

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getNombre() {
    return this.nombre;
  }
 
  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public int getTelefono() {
    return this.telefono;
  }

}


Persona persona = new Persona();



