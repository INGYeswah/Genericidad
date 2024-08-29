Funcionamiento del programa de java

// Cabe aclarar que el programa al iniciar vuelve a pedir los datos de un segundo, tercer y cuarto usuario, y asi mismo imprime los mismos datos mostrados en el ejemplo pero con mas usuarios.
// Ademas los datos que se llevaran a la base de datos se encuentran en el bucle para su procesamiento
//                 String name = (String) ((Pair) arrayUser.get(0)).getSecond();
//                 int edad = (Integer) ((Pair) arrayUser.get(1)).getSecond();
//                 LocalDate date = (LocalDate) ((Pair) arrayUser.get(2)).getSecond();
//                 String eps = (String) ((Pair) arrayUser.get(2)).getSecond();



Ejemplo de funcionamiento: 

Ingrese su nombre:
(InputUser): Yeswah
Ingrese su edad:
(InputUser): 19
Ingrese su fecha de nacimiento:
//A la hora de meter la fecha es necesario que sea dela forma 2021-12-21
//Si la fecha está en formato ISO Local Date (yyyy-mm-dd), no necesitamos configurar el formato. Podemos analizar directamente el String al método parse() que devuelve la fecha local.
(InputUser): 2005-04-21 
Ingrese su eps:
(InputUser): Sanitas
El nombre del usuario es: Yeswah
La edad del usuario es: 19
La fecha es 2005-04-21 
La EPS del usuario es: Sanitas
