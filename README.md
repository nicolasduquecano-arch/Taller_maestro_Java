# Taller Maestro de POO en Java

Este repositorio contiene la solución y el desarrollo del Taller Maestro de Programación Orientada a Objetos en Java. A lo largo del proyecto fuimos implementando cada uno de los conceptos de la materia hasta integrar todo en el sistema de combate por turnos contra el Jefe Final (El Dragón Null).

El proyecto se encuentra organizado dentro de la carpeta `src/` en paquetes independientes para cada nivel.

---

## Estructura del repositorio

El código está dividido en los siguientes paquetes:

* `Nivel1`: Definición de clases, atributos, instanciación con `new` y métodos.
* `Nivel2`: Encapsulamiento de atributos con `private`, constructores con `this` y metodos `getters` y `setters` con validación.
* `Nivel3`: Herencia utilizando `extends`, llamados a la superclase con `super`, visibilidad `protected` y sobrescritura con `@Override`.
* `Nivel4`: Polimorfismo mediante arreglos del tipo base (`Personaje[]`), sobrecarga de métodos, uso de `instanceof` y casteo.
* `Nivel5`: Agregación con `ArrayList`, reglas selladas usando `final` y constantes `static final`.
* `JefeFinal`: Sistema completo integrado (`Personaje`, `Guerrero`, `Mago`, `Arquero`, `Dragon`, `Escuadron`) para la simulación de la batalla por turnos.

---

## Explicación del desarrollo por niveles

### Nivel 1: La forja de héroes
Creamos la clase base `Heroe` con sus atributos (`nombre`, `vida`, `ataque`) y métodos para realizar acciones dentro del juego. Probamos la instanciación de objetos usando `new`, cómo se comportan las referencias en memoria al asignar variables y la diferencia entre métodos que devuelven un valor (`return`) y métodos `void`.

### Nivel 2: La bóveda del gremio
Implementamos encapsulamiento cambiando la visibilidad de los atributos a `private` para evitar que el estado de los personajes fuera modificado de forma directa desde fuera de la clase. Agregamos constructores para asegurar que los objetos se creen con sus datos completos y definimos metodos `get` y `set` con reglas para controlar que valores como la vida no tomaran números negativos o superiores al límite establecido.

### Nivel 3: El linaje
Modelamos la jerarquía de clases definiendo a `Personaje` como la clase padre, de la cual heredan `Guerrero` y `Mago` usando `extends`. Usamos `super(...)` en los constructores de las clases hijas para inicializar los atributos heredados y usamos la anotación `@Override` para adaptar el método `presentarse()` según las características particulares de cada tipo de personaje.

### Nivel 4: La arena de los mil rostros
Aplicamos polimorfismo creando un arreglo de tipo `Personaje[]` donde almacenamos instancias de `Guerrero` y `Mago`. Al recorrer el arreglo en un ciclo e invocar el método `atacar()`, comprobamos cómo Java ejecuta la versión correspondiente al objeto real en tiempo de ejecución. También implementamos sobrecarga de métodos y verificaciones de tipo mediante `instanceof`.

### Nivel 5: El escuadrón sellado
Modelamos la relación de agregación en la clase `Escuadron`, administrando la lista de héroes mediante un `ArrayList<Personaje>`. Adicionalmente, usamos el modificador `final` en atributos, métodos y clases para bloquear modificaciones indebidas y heredabilidades no permitidas, y creamos la clase `Reglas` con constantes `static final`.

### Jefe Final: Batalla contra el Dragón Null
Integramos todo el trabajo realizado en las etapas previas:
* Implementamos la subclase `Arquero` con su lógica de ataque basada en precisión.
* Creamos la clase `Dragon` con patrones de ataque por rondas.
* Estructuramos la lógica de combate en `Escuadron` para calcular el daño total del grupo y repartir el daño recibido según el orden de los personajes.
* Determinamos el orden ideal de los integrantes dentro del escuadrón para maximizar la resistencia del grupo y lograr vencer al dragón dentro del límite de rondas.

---

## Instrucciones de ejecución

1. Abrir la carpeta `Taller_maestro_Java-master` en un entorno de desarrollo para Java (IntelliJ IDEA, VS Code, NetBeans) o compilar desde terminal.
2. Ingresar a la carpeta `src/`.
3. Seleccionar la clase `Main.java` del paquete correspondiente al nivel que se desea probar (`Nivel1`, `Nivel2`, `Nivel3`, `Nivel4`, `Nivel5` o `JefeFinal`) y ejecutarla.
