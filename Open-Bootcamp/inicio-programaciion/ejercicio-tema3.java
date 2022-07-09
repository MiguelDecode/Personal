/* Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto. */


public static int sumar(int a, int b, int c) {
  return a + b + c;
}

sumar(1,2,3);

public class Coche {

  public int puertas = 0;

  public void sumarPuerta() {
    this.puertas++;
  }
}

Coche miCoche = new Coche();

miCoche.sumarPuerta();

System.out.println(miCoche.puertas);




/* 
public class Main {

  public static void main(String[] args) {
      suma(20, 40, 60);

      Coche miCoche = new Coche();

      miCoche.sumarPuertas();
      miCoche.sumarPuertas();
      System.out.println("El numero de puertas es: " + miCoche.numeroDePuertas);

  }

  public static void suma(int a, int b, int c){
      int resultado;
      resultado = a + b + c;
      System.out.println(resultado);
  }
}

class Coche {
  public int numeroDePuertas = 4;

  public void sumarPuertas(){

      this.numeroDePuertas++;
  }
} */