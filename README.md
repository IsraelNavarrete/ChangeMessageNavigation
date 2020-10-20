19/10

1º
Explicacion fragments

https://moronlu18.com/wordpress/courses/deint/178-1931

2º
Explicacion Modelo Vista Ccontrolador

https://moronlu18.com/wordpress/courses/deint/178-1954

3º
Explicacion ciclo de vida de un fragment

https://moronlu18.com/wordpress/courses/deint/178-1932

4º
Creamos un nuevo proyecto (copiamos el ya existente y cambiamos el nombre)
Renombrar package changemessage -> changemessagefragment y el build.gradle

Creamos 2 nuevos fragment blank en la carpeta ui

Me ha ocurrido un ERROR donde el nombre de los paquetes son diferentes (cambia una letra mayuscula en el import de la clase y sale
ERROR en R)

5º
Cogemos la vista de activity_send_message y la pegamos en el fragment_send_message ya que es quien se encarga de la vista
Borramos to.do el xml y lo reemplazamos por un frame layout

Cambiamos el nombre de SendMessageActivity a MainActivity y su activity igual

Copiamos el codigo de mainactivity a SendMessageFragment y cambiamos los this por getActivity()