import java.util.Scanner;

public class LaNotanlisimaPrueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float promedio;
        int Aprobados = 0;


        for(int i = 1 ; i <= 4 ; i++){
            System.out.println("por favor estudiante "+i+" ingrese su primera nota");
            float numNota1 = scanner.nextFloat();
            System.out.println("ingrese la segunda nota");
            float numNota2 = scanner.nextFloat();
            System.out.println("ingrese la tercera nota ");
            float numNota3 = scanner.nextFloat();
            promedio = (numNota1 + numNota2 + numNota3 ) / 3 ;
            if(promedio >= 3){
                Aprobados++;
            }
        }

        System.out.println(" solo "+Aprobados+" aprobaron");
        scanner.close();



    }
}
