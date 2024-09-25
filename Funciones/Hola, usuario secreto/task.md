Imagina que estás escribiendo una función `saludos()`, que saluda a cada nuevo usuario en un foro de hackers.

Debería devolver `Hola, nombre!`, donde `nombre` es el nombre de usuario. 

Pero como es un foro para hackers, un usuario puede elegir ocultar su nombre de usuario durante el registro. En esta situación, la función debería devolver `Hello, secret user!`.
Para hacer esto, necesitas llamar a la función `saludos()` sin argumentos.

Completa la función greetings().

````kotlin
fun saludos(...): String {
    ...
}
````