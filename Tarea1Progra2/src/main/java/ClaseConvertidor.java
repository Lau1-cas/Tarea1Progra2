import java.util.Scanner;
import java.util.InputMismatchException;
public class ClaseConvertidor {


    public static void main(String[] args) {
       Scanner teclado = new Scanner( System.in );
	Scanner sn = new Scanner(System.in);
	
	
        boolean salir = false;
        int opcion; 
        String nombre;
        int quetzal=0;
        double dolar=0.13;
        double euro=0.11;
        double yen=14.19;
        double conversion; 
        
        System.out.println("Ingrese su Nombre");
        nombre=teclado.nextLine( );
        
            while (!salir) {
 
            System.out.println("1. Convertir quetzales a Dolares");
            System.out.println("2. Convertir quetzales a Euros");
            System.out.println("3. Convertir quetzales a Yenes");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escriba una de las opciones\n");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                     
                        System.out.print( "Introduzca el numero en quetzales: " );
                       quetzal = teclado.nextInt();

                       conversion=quetzal*dolar;
                       System.out.println (nombre+ " "+"Su conversion es: "+conversion+" "+"dolares\n") ;
                      
                        break;
                    case 2:
                        System.out.print( "Introduzca el numero en quetzales: " );
                       quetzal = teclado.nextInt();

                       conversion=quetzal*euro;
                       System.out.println (nombre+ " "+"Su conversion es: "+conversion+" "+"euros\n") ;
                        break;
                    case 3:
                       System.out.print( "Introduzca el numero en quetzales: " );
                       quetzal = teclado.nextInt();

                       conversion=quetzal*yen;
                       System.out.println (nombre+ " "+"Su conversion es: "+conversion+" "+"Yenes\n") ;
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo están disponibles tres opciones de conversion");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe insertar un número");
                sn.next();
            }
        }
                       
	}
}
