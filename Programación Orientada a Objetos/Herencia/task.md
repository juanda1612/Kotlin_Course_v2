# Herencia

```java
class MainActivity : ComponentActivity(){
...
}
```

Si bien Kotlin utiliza mucho la programación funcional, es principalmente un lenguaje de programación orientada a objetos (POO), y por tanto utiliza el mecanismo de herencia para reutilizar código.

## Para que una clase sea extensible, tienes que abrirla

Por ejemplo, podemos crear la siguiente clase (lo que ves entre paréntesis es como el constructor, que puedes definir ahí):

```java
class Libro(val páginas: Int, val autor: String, var precio: Double)
```

Declaramos la clase libro, con dos atributos: páginas, de tipo Int y autor, de tipo String. Esta clase así escrita no permite que se herede de ella porque en Kotlin todas las clases están cerradas para herencia de forma predeterminada.

Si quieres permitir la herencia tienes que añadir la palabra open:

```java
open class Libro(val páginas: Int, val autor: String, var precio: Double)
```

Ahora podemos heredar de ella, lo cual se indica con : (dos puntos).

Por ejemplo, declaramos la clase Comic, que hereda de Libro. Para que esto funcione a la clase hija debemos pasarle los valores de los atributos de la superclase (páginas y autor, en este caso).

```java
class Comic(páginas: Int, autor: String, precio: Double) : Libro(páginas, autor, precio)
```
