package clasegenerica;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class ClaseGenerica {

    public static void main(String[] args) {

        ArrayList datos = new ArrayList(4);
        datos.add(Usuario());
        datos.add(Usuario());
        datos.add(Usuario());
        datos.add(Usuario());

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j < 4; j++) {

                // Almacenar los datos de cada uno de los campos para su almacenamiento en base de datos
                ArrayList arrayUser = (ArrayList) datos.get(j);
                String name = (String) ((Pair) arrayUser.get(0)).getSecond();
                int edad = (Integer) ((Pair) arrayUser.get(1)).getSecond();
                LocalDate date = (LocalDate) ((Pair) arrayUser.get(2)).getSecond();
                String eps = (String) ((Pair) arrayUser.get(2)).getSecond();

                ((Pair)arrayUser).toString();
                
            }
        }

        //       ArrayList datos = new ArrayList(4);
        //       Manzana manzana1 = new Manzana();
        //       Persona persona1 = new Persona("nestor");
        //       
        //       datos.add(persona1);
        //       datos.add("Carlos");
        //       datos.add(45);
        //       datos.add(manzana1);
        //       
        //       
        //       
        //       String Nombre = (String)datos.get(1);
        //       Manzana Fruta = (Manzana)datos.get(3);
        //       System.out.println("El nombre es "+ Nombre+" Y la Fruta es " + Fruta);
        //       System.out.println("///");
        //       System.out.println("///");
        //       System.out.println("///");
        //       System.out.println("///");
        //              
        //       String nombre1 = Integer.toString((Integer)datos.get(2));
        //       
        //       System.out.println("Los nombre de la colección son " + datos.get(2));       
        //       
        //       
        //       
        //       caja<String> cajaCadena = new caja<String>();
        //       caja<Manzana> cajaManzanas = new caja<Manzana>();
        //        System.out.println("comparacion " + cajaCadena.equals(cajaManzanas));
        //       
        //        
        //        
        //        
        //       Manzana fruta1 = new Manzana();
        //       String palabra = "test";
        //       cajaCadena.SetDato(palabra);
        //       cajaManzanas.SetDato(fruta1);
        //       cajaManzanas.GetDato().despacho();
        //       
        //       System.out.println("El texto de la caja es" + cajaCadena.GetDato());
        //   
        //       System.out.println(cajaCadena.GetDato().toUpperCase());
        //       
        //       
    }

    public static ArrayList Usuario() {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = (String) in.next();
        Pair<String, String> pairName = new Pair<>("El nombre del usuario es: ", name);

        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(in.next());
        Pair<String, Integer> pairEdad = new Pair<>("La edad del usuario es: ", edad);

        System.out.println("Ingrese su fecha de nacimiento: ");
        LocalDate date = LocalDate.parse(in.next());
        Pair<String, LocalDate> pairDate = new Pair<>("La fecha es ", date);

        System.out.println("Ingrese su eps: ");
        String eps = (String) in.next();
        Pair<String, String> pairEps = new Pair<>("La EPS del usuario es: ", eps);

        ArrayList user = new ArrayList(4);

        user.add(pairName);
        user.add(pairEdad);
        user.add(pairDate);
        user.add(pairEps);

        return user;

    }

}
