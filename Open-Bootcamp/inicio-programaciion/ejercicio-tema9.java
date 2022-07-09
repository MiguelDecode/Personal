/* Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */

public class Main {

  public static void main(String[] args) {

    Cliente cliente = new Cliente();
    cliente.edad = 42;
    System.out.println(cliente.edad)
    cliente.nombre = 'IKEA';
    System.out.println(cliente.nombre)
    cliente.telefono = 987584165;
    System.out.println(cliente.telefono)
    cliente.credito = 100;
    System.out.println(cliente.credito)

    Trabajador trabajador = new Trabajador();
    trabajador.edad = 56;
    System.out.println(trabajador.edad);
    trabajador.nombre = 'Rafael';
    System.out.println(trabajador.nombre);
    trabajador.telefono = 658972587;
    System.out.println(trabajador.telefono);
    trabajador.salario = 1500;
    System.out.println(trabajador.salario);

  }
}

class Persona {

  int edad;
  String nombre;
  int telefono;

  public int getEdad() {
    return this.edad;
  }

  public int setEdad(int edad) {
    this.edad = edad;
  }

  public string getNombre() {
    return this.nombre;
  }

  public String setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTelefono() {
    return this.telefono;
  }

  public int setTelefono(int telefono) {
    this.telefono = telefono;
  }
}

class Cliente extends Persona {

  int credito;

  public int getCredito() {
    return this.credito;
  }

  public int setCredito(int credito) {
    this.credito = credito;
  }
}

class Trabajador extends Persona {
  
  int salario;

  public int getSalario() {
    return this.salario;
  }

  public int setSalario(int salario) {
    this.salario = salario;
  }
}
