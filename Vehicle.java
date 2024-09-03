import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {

        // Declaracion de variables para almacenar 
        //los datos ingresados por el usuario 

        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String marca;
        String modelo;
        int cilindrada;
        String combustible;
        int capacidad;

        System.out.println("***   Distribuidora de comida   ***");

        //Peticion de datos al usuario y recuperacion de estos a traves 
        //del scanner 
        
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

       // nextInt() despues de usar, deja un caracter \n, 
       // dicho caracter causa que la siguiente vez que se utilice
       // nextLine() en vez de almacenar la entrada del usuario, 
       // se almacene una linea vacia
       //por lo que la linea sc.nextLine() se encarga de tomar esa 
       // linea vacia.
        sc.nextLine();
    

        System.out.println("Ingrese marca del vehiculo: ");
        marca = sc.nextLine();

        System.out.println("Ingrese modelo del vehiculo: ");
        modelo = sc.nextLine();
    
        System.out.println("Ingrese cilindrada del vehiculo:");
        cilindrada = sc.nextInt();
        sc.nextLine();
    

        System.out.println("Ingrese tipo de combustible del vehiculo: ");
        combustible = sc.nextLine();
    
        System.out.println("Ingrese la capacidad de pasajeros del vehiculo: ");
        capacidad = sc.nextInt();

        // Cierre del scanner  ya que no volvera a ser utilizado en el programa
        sc.close();

        // Impresion de todos los datos almacenados anteriormente.
        
        System.out.println("***   Datos del cliente   ***");
        System.out.println("Cliente: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("***   Datos del vehiculo   ***");
        System.out.println("La marca que ha ingresado es: "+ marca);
        System.out.println("El modelo que ha ingresado es: "+ modelo );
        System.out.println("La cilindrada que ha ingresado es:"+ cilindrada);
        System.out.println("El tipo de combustible es: "+ combustible);
        System.out.println("Tiene una capacidad de "+ capacidad+ " pasajeros");
    }
}