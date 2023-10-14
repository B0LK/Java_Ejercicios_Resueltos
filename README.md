# Java_Ejercicios_Resueltos
Bienvenidos a mi repositorio de ejercicios resueltos, donde encontrarás soluciones a desafíos de lógica de programación realizados en java. 

1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca 

4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).

5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.

9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

11) Haz el mismo ejercicio anterior con un bucle for.

12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.

13) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

14) Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.

15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

16) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.

18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.

20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.

21) Muestra los números primos entre 1 y 100.

22) Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total (recorre el String con charAt).

23) Reemplaza todas las a del String anterior por una e.

24) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. Muestralos en linea recta, separados por un espacio entre cada carácter.

25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
Los signos aritméticos disponibles son:

+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.

26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.

27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de números introducidos.

28) Eliminar los espacios de una frase pasada por consola por el usuario.

29) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Mostrar la cadena resultante

30) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.

31) Mostrar la longitud de una cadena.

32) Pedir dos palabras por teclado, indicar si son iguales.

33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.

34) Dada una frase, separarlo en palabras.

35) Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).

36) Modifica el anterior enum para indicar que es día laborable directamente (usar toString).

37) Crea el enum Mes, que contenga como parametros el orden(1,2,3,etc) y el numero de dias (febrero tendra 28 dias siempre).

Estos datos pueden pedirse por separado, asi que tienes que hacer sus respectivos get. No son necesarios los setters.

Create un arrays de Mes (mirate la funcion values), pide un numero por teclado e indica que meses tienen ese numero de dias (toda su informacion).

Por ejemplo, si escribes un 28, este te devolvera la informacion de FEBRERO.

38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
– mayor numero introducido
– menor numero introducido
– suma de todos los numeros
– suma de los numeros positivos
– suma de los numeros negativos
– media de la suma (la primera que pido)

El número -1 no contara como número.

39) Realiza un reloj digital que muestre la hora sin parar.

Debe esperar un segundo real para darle mas realismo.
