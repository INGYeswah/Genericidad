# README: Programa de Gestión de Usuarios en Java

## Descripción

Este programa en Java permite ingresar y procesar la información de múltiples usuarios. Al iniciar, el programa solicita los datos de cada usuario y los almacena. Luego, muestra la información ingresada en la pantalla.

Ademas los datos que se llevaran a la base de datos se encuentran en el bucle para su procesamiento
```java
// Obtener el nombre del usuario
String name = (String) ((Pair) arrayUser.get(0)).getSecond();

// Obtener la edad del usuario
int edad = (Integer) ((Pair) arrayUser.get(1)).getSecond();

// Obtener la fecha de nacimiento del usuario
LocalDate date = (LocalDate) ((Pair) arrayUser.get(2)).getSecond();

// Obtener la EPS del usuario
String eps = (String) ((Pair) arrayUser.get(3)).getSecond();
```

## Funcionamiento

### Entrada de Datos

El programa solicita los siguientes datos para cada usuario:

1. **Nombre del Usuario:**
   - El usuario debe ingresar su nombre.
   - Ejemplo de entrada: `Yeswah`

2. **Edad del Usuario:**
   - El usuario debe ingresar su edad en formato numérico.
   - Ejemplo de entrada: `19`

3. **Fecha de Nacimiento:**
   - El usuario debe ingresar su fecha de nacimiento en formato ISO Local Date (`yyyy-MM-dd`).
   - Ejemplo de entrada: `2005-04-21`

4. **EPS del Usuario:**
   - El usuario debe ingresar el nombre de su EPS (Entidad Promotora de Salud).
   - Ejemplo de entrada: `Sanitas`

### Ejemplo de Salida

Para los datos de entrada proporcionados, el programa mostrará la siguiente salida:

El nombre del usuario es: Yeswah  La edad del usuario es: 19 La fecha es: 2005-04-21 La EPS del usuario es: Sanitas
