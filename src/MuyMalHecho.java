import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int Contador = 0;

        System.out.println("Número de usuarios a ingresar:");
        int numUsusarios = scanner.nextInt();
     

        int numEdad1 = 0, numEdad2 = 0, numEdad3 = 0;
        String strNombre1 = "", strNombre2 = "", strNombre3 = "";

        while (Contador < numUsusarios){

            System.out.println("Nombre del usuario:");
            String strNombre = scanner.nextLine();
            strNombre = scanner.nextLine();

            System.out.println("Edad del usuario:");
            int numEdad = scanner.nextInt();


            switch (Contador) {
                case 0 :
                    strNombre1 = strNombre ;
                    numEdad1 = numEdad;
                    break;

                case 1 :
                    strNombre2 = strNombre ;
                    numEdad2 = numEdad;
                    break;

                case 2 :
                    strNombre3 = strNombre;
                    numEdad3 = numEdad;
                    break;    
            
                default:
                    break;
            }

            if (numEdad >= 18) {
                System.out.println(strNombre + " es mayor de edad.");
            } else {
                System.out.println(strNombre + " es menor de edad.");
            }

            if (numEdad > 120 || numEdad < 1) {
                System.out.println("Edad no válida.");
            }

            Contador++;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + strNombre1 + " - Edad: " + numEdad1);
        System.out.println("Usuario 2: " + strNombre2 + " - Edad: " + numEdad2);
        System.out.println("Usuario 3: " + strNombre3 + " - Edad: " + numEdad3);
        scanner.close();
    }
}