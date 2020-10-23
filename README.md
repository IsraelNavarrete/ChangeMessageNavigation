23/10

1º
Correcion de errores igual que en ChangeMessageFragment

2º
Añadimos en res el nav_graph en new Android Resource File

Añadimos al navigation los 3 fragments

Añadimos una accion Del SendMessage a ViewMessage y al About

3º
Vamos a activity_main y añadimos un fragment el cual se encarga del intercambio de fragmentos

https://moronlu18.com/wordpress/courses/deint/178-2038

4º
En SendMessage en el metodo de click del boton sendMessage conectamos el SendMessage con ViewMessage
con un metodo NavHostFragment.findNavController()

5º
Quitamos codigo innecesario en MainActivity (se queda la activity vacia solo se gestiona a si misma)

6º
Vemos que los Basic Activity de los nuevos proyectos es mas o menos lo que hemos hecho nosotros

Podemos hacer desde nav_graph que al hacer una accion el fragment nuevo tenga que recibir argumentos
para hacerlo hay que marcar el fragment y en arguments darle al mas

7º
Añadimos al bundle del proyecto
        def nav_version = "2.3.0"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"

Añadimos al bundle del módulo
        apply plugin: 'com.android.application'
        apply plugin: 'androidx.navigation.safeargs'

IMPORTANTE DARLE AL BOTON MAKEPROJECT (el martillo) PARA QUE COMPILE LAS CLASES

Estos plugins nos crea una nueva clase automatica llamada NombreClase + Directions
la cual a su vez crea una clase llamada como el action es decir si el action es "actionSendtoMessage"
la clase se llama "ActionSendtoMessage"
Tambien se genera un metodo que se llama como el action "actionSendtoMessage" en el cual guardamos el message

8º
Cambiamos la manera de enviar el message entre los fragments y utilizamos las clases generadas