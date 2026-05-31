package org.taller;

// Esto genera ERROR de compilación
public interface Vehiculo {
    void mover();
}

// Esto produce un ERROR: Coche no implementa el método mover()
// Java obliga a implementar todos los métodos de la interfaz,
// o bien declarar la clase como abstract

public class Coche implements Vehiculo {
    // método mover() no implementado → error de compilación
}

//EXPLICACIÓN:
/*Cuando una clase concreta (no abstracta) implementa una interfaz
 pero no define todos sus métodos, Java genera el error: "Coche is
 not abstract and does not override abstract method mover() in Vehiculo".
 La solución es o implementar el método, o declarar Coche como abstract
*/

//Intentar definir métodos predeterminados en una clase abstracta

//EXPLICACIÓN

/*Los métodos default son exclusivos de las interfaces (disponibles desde Java 8).
En una clase abstracta no existe la palabra clave default para métodos: las clases
abstractas simplemente tienen métodos concretos (con cuerpo) y métodos abstractos
(sin cuerpo). Intentar escribir default void metodo() dentro de una clase abstracta
genera un error de compilación porque esa sintaxis no está definida para clases. La
diferencia es que en una interfaz, default permite tener un método con implementación
sin romper las clases que ya la implementan.
*/