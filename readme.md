# Programa Grupal de Programación
Este proyecto, esta separado por clases para asi tener un mejor control del codigo que estamos empleando, no significa que sepamos el 100% de como usar una case, tenemos metodos implementados, funciones, etc, **Repito** no es que sepamos 100% usarlos, solo para mejorar la experiencia, y la reutilización del codigo, por eso  lo implementamos
## Instalación

Pruede descargar el codigo dando al boton:

![Imagen:](https://github.com/Savecoders/JavaSwitch/blob/master/img/download.png)

## Instalación con Git
**Paso 1.** Crear una carpeta, ingresar a git bash y ejecutar.

```
    git clone https://github.com/Savecoders/JavaSwitch.git
```

**Paso 2.** Abrir su IDE o editor de codigo favorito.

**Paso 3.** En el directorio /src/com/company/ se encuentra todo el codigo, por si desean juntarlo con un codigo ya existente.
# Programas

### Los programas que quisimos usar fueron los siguientes.


- **Primer Programa:** Victoria Aleatoria.

- **Segundo Programa** Crear un archivo .txt

- **Tercer Programa**  Leer un Archivo .txt

- **Cuarto Programa**  Ordenar Arreglos

- **Programa Default** Mostrar Figuras Geometricas

------------


#### Victoria Aleatoria
  El funcionamiento de este programa es el siguiente.
 
 1.   Genera Un Numero Aleatorio Del 0 Al 20
 2.    Luego El Usuario Debe Ingresar Un Numero Dentro De Este Mismo Rango
 3.  Si El Usuario Ingresa El Mismo Numero Que Genero El Programa, Mostrara Un Mensaje Que Gano Y Con Colores 
 4.  Si Son Diferentes, Mostrara Que No Logro Asertar. 

------------


####  Crear un archivo .txt
  Antes de continuar usamos una libreria para poder crear el archivo, no es 100% compatible con windows las pruebas fueron realizadas en una   pc con un SO linux
  ```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

```
1.   Primero el programa hace una peticion al usuario, para obtener la ubicacion y tambien como quiere nombrar a su archivo.
2.   El programa obtiene la ruta y procesa si en esa direccion se encuentra un archivo existente, en caso que no sea asi procede a crearlo.
3.   Le pedimos al usuario una oración para guardarla dentro del archivo.
4.   El programa termina y regresa la ubicación del archivo.
5.   Puedes dirigirte a esa ubicacion y lo encontraras.

------------


####  Leer un archivo .txt
Este procedimiento es casi lo mismo que el anterior y usamos las mismas librerias.

1. Primero  el programa nos va a petir la direcion de donde se encuentra el archivo y su respectivo nombre.
2. Luego el programa procedera a buscar ese archivo y va a leerlo.
3. Luego de leerlo impirmir lo que tenga y luego va a calcula cuantas letras son mayusculas y minusculas.
4. Las va a mostrar por la terminal y nos va a decir en que SO estamos usando.
------------


#### Ordenar Arreglos
Este programa es muy facil de explicar con ayuda de metodos como el metodo burbuja.

1. Primero el programa le pide el tamaño del arreglo, si estes un numero decimal saltara un error, de la cual lo mostrara por pantalla
2. Luego va a pedir todos los numeros, dependiendo del tamaño del arreglo
3. Luego el programa va a mostrar el arreglo tal cual como lo ingreso el usuario.
4. Luego va a imprimirlo de forma ascendente y desendente.

>No utilizamos los metodos que no da java para resolver este ejercicio , como el metodo Upper()
Solo utilizamos ciclos for y el metodo burbuja para cambiar el orden del arreglo si lo haciamos por el metodo Upper() eso era trampa.
