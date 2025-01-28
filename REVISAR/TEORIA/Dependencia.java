public class Dependencia {
    public static void main(String[] args) {
        muestraVariosMensajes();
    }

    // Relación de dependencia
    public static void muestraVariosMensajes(){
        // Creamos un objeto de una clase dentro del método de otra clase:
        Mensajes m = new Mensajes();
        m.Info("Mensaje de info");
        m.Alerta("Mensaje de alerta");
        m.Error("Mensaje de error");
    }
}

/**
 * Relación de asociación: una clase contiene objetos de otra clase como atributos de la propia clase .
 * Ejemplos:
 * 
 * class PartidaSimple {
 *      Jugador jugador; // Multiplicidad 1 a 1 (una partida, un jugador)
 * }
 * 
 * class PartidaDoble {
 *      Jugador jugador1;  // Multiplicidad 1 a 2 (una partida, dos jugador)
 *      Jugador jugador2;
 * }
 * 
 * class PartidaMultijugador {
 *      Jugador[] jugadores;  // Multiplicidad 1 a n (una partida, varios jugador)
 * }
 * 
 * Relación de agregación: un objeto formado por otros objetos pero que pueden tener existencia por si mismos.
 *                         Ejemplo: un personaje de un videojuego puede tener un objeto tipo Arma, otro Armadura, otro Escudo.
 * Relación de composición: un objeto formado por otros objetos que no tienen sentido sin el propio objeto que componen.
 *                          Ejemplo: un jugador desaparece si desaparece la partida de la que forma parte.
 * 
 * */ 

/**
 * Relación de herencia:
 * Dos clases comparten características comunes, una de ellas es más general (superclase) que la otra que será más especializada (subclase)
 * Ejemplo: clase Persona (general) puede especializarse en clase Profesor y clase Alumno (más especializadas)
 *  */ 

/** 
 * Herencia: reutilización de código para definir clases a partir de otras, heredando sus propiedades y métodos.
 * Simple -> una subclase deriva de una superclase.
 * Múltiple -> una subclase deriva de varias superclases.
 * 
 * Mecanismos:
 * 1) Especialización: subclase es una especialización de superclase.
 * 2) Generalización: superclase es una generalización de varias subclases.
 *
 * Palabra reservada extends.
 * Además de los atributos y métodos heredados, podremos añadir atributos y métodos propios.
 * (*Ver imagen Herencia.png)
 */

/**
 * Recordatorio: desde dentro de un constructor, podíamos invocar a otro de la misma clase mediante this()
 * El constructor de la subclase podrá invocar al constructor de la superclase mediante la palabra reservada super() (mismo mecanismo que antes)
 * This y super: primera línea  del constructor, solo podrá usarse una. Si this -> Java incluirá automáticamente llamada a super()
 */

/**
 * Ocultación y sobreescritura:
 * Si en subclase definimos atributo con mismo nombre que superclase: subclase oculta atributo superclase.
 * Si en subclase definimos método con mismo nombre, firma y tipo de valor de retorno que en superclase: subclase sobreescribe el método (@override)
 */

 // (Ver Ejemplo1)

/**
 * Caso: el comportamiento común no sea exactamente igual sino parecido en cada subclase. 
 * Solución: métodos y las clases abstractas, que nos servirán para especificar un comportamiento común, 
 * pero de cuya implementación se encargarán las propias subclases.
 */

/**
 * Método abstracto: se define en una clase pero deja su implementación a las subclases de ésta.
 * Clase abstracta: su finalidad es la creación de otras clases a partir de ella en lugar de objetos (no new())
 *                  cualquier clase puede ser abstracta
 *                  si una clase tiene un método abstracto -> necesariamente abstracta
 * Clase final: no permite que otras clases hereden de ella
 * */ 

 // (Ver Ejemplo2)

/**
 * Interfaz: clase completamente abstracta, todos sus métodos son abstractos y sus atributos constantes (final)
 * Una instancia u objeto **implementa** una interfaz.
 * Si un objeto implementa una interfaz podemos saber su comportamiento, de forma independiente a como se ha implementado.
 * Métodos public y abstract
 * Variables  y atributos public static y final
 * Interface public
 */

/** 
 * Desde Java 8 de pueden implementar métodos por defecto en las interfaces
 * public default <tipo de retorno> <nombreMétodo> ([argumentos])
 * Las clases que implementen esta interfaz tendrán ya esta implementación común para el método aunque pueden sobreescribirlo
*/