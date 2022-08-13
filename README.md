# TABLA DE CONTENIDOS
- [Tecnologias](#tecnologias)
- [Orden](#orden)
- [Funcionamiento](#funcionamiento)
  * [Ventana_1](#ventana_1)
  * [Ventana_2](#ventana_2)
  * [Ventana_3](#ventana_3)
  * [Ventana_4](#ventana_4)
    
   
 


# Descripcion

> Esta app de escritorio fue realizada con la intencion de crear un programa que permita a una biblioteca tener un registro de sus libros, con las siguientes funciones, agregar, modificar, eliminar, crear reportes pdf y restringir 
quienes pueden usar su aplicacion mediante un sistema de login. La aplicacion almacena sus datos en una base de datos local.

<!-- toc -->

## Tecnologias
Database: MySQL

Lenguaje de programacion: JAVA

Administrador de base de datos: PHPmyadmin

Para usar un servidor local de forma sencilla: XAMPP

Librerias: iText(para gestionar y crear pdf), Swing(biblioteca grafica)

## Orden

El orden esta dividido en tres paquetes

Paquete clases:
Tiene la clase conexion

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/clases/Conexion.java#L1-L15

Paquete images:
Tiene todas las imagenes utilizadas para la parte estetica de la aplicacion

Paquete ventanas:
Tiene todas las ventanas graficas que se usan en la aplicacion con sus respectivas funciones.


## Funcionamiento

Breve explicacion de los funcionamientos de este programa y de como se crearon

### Ventana_1


![Login](https://user-images.githubusercontent.com/108648799/184504494-cdfe8fc4-5b3a-4567-a42a-7e095fce9abf.jpg)

![Bd_users](https://user-images.githubusercontent.com/108648799/184505525-bb4a0fde-7e81-48cb-87de-62ea11bc97a8.jpg)


La ventana 1 es un login, es el inicio del programa la cual hace una consulta a la base de datos(local) para verificar si el usuario ingresado existe y permitirle el acceso al resto del programa.

En caso de que no exista se le notificara con un mensaje en pantalla o si no rellena los campos correspondientes tambien se le notificara en pantalla

Codigo

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Uno.java#L70-L95

### Ventana_2

![Option](https://user-images.githubusercontent.com/108648799/184504965-5cce33fd-cdb0-45a8-bb56-78f8a866303e.jpg)

La ventana 2 nos muestra dos botones, el primero es para entrar y ver los libros registrados, el segundo es para agregar un nuevo usuario asi puede iniciar en el login

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Dos.java#L66-L74

### Ventana_3

![LibrarySystem](https://user-images.githubusercontent.com/108648799/184505119-58894e98-9964-41c8-a0ee-353a3a2f9b31.jpg)

![Bd_library](https://user-images.githubusercontent.com/108648799/184505519-73ae9977-57a8-48ef-88d0-346f3df4aa25.jpg)


La ventana 3 es la que tiene el funcionamiento principal de la aplicacion, es donde podras agregar, modificar, eliminar, buscar, etc.

Donde tiene varios botones con diversas funciones y una tabla con eventos cuando alguien hace un click en ellos

Esta el boton registro, el cual se encargara de registrar los libros que queramos en una base de datos(local).

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Tres.java#L185-L213

Esta el boton modificar, en donde al hacer click en una fila de la tabla se llenara automaticamente los campos en donde podras modificar lo que necesites(la modificacion se hace a partir del ID)
y se actualizara la base de datos con la modificacion realizada

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Tres.java#L225-L253

Esta el boton eliminar, en donde sucede lo mismo que con el de modificar, pero la diferencia que los elimina de la base de datos a partir del ID

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Tres.java#L270-L296

Esta el boton buscar por titulo en donde el usuario puede realizar una busqueda si tiene stock de un libro en este caso en vez de usar el ID para buscar usaremos el titulo y rellenara los campos con los datos del libro que busquemos en caso de encontrarlo

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Tres.java#L298-L322

Esta el boton generar pdf el cual nos genera un pdf con el contenido que tengamos en nuestra tabla y lo aloja en el escritorio

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Tres.java#L324-L360

Para mas informacion sobre diversos metodos utilizados en esta ventana ver el codigo completo

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Tres.java#L1-L454

### Ventana_4

![Add_user](https://user-images.githubusercontent.com/108648799/184505603-2bfa875c-009a-4175-a802-7fb26890abd1.jpg)

En esta ventana se puede agregar un usuario nuevo para que pueda ingresar al login mas tarde

https://github.com/DMAlmeyda/Sistema_Bibliotecario_GUI-CRUD/blob/6a995216cc0771a9d5a13d26dae76b0aab75cb53/src/ventanas/Ventana_Cuatro.java#L74-L96

