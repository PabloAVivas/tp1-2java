import java.util.Scanner;

public class recomendacion_libro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce el numero del genero de libro que mas te gusta: \n1-Fantasia \n2-Misterio \n3-Romance \n4-Ciencia ficción \n");
        num = sc.nextInt();
        switch (num){
            case (1):System.out.println("Te recomiendo El Hobbit");
                break;
            case (2):System.out.println("Te recomiendo La Dama de Blanco");
                break;
            case (3):System.out.println("Te recomiendo Donde Todo Brilla");
                break;
            case (4):System.out.println("Te recomiendo La Maquina del Tiempo");
                break;
        }
    }
}
