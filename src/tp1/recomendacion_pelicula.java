import java.util.Scanner;
public class recomendacion_pelicula {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce el numero del genero de pelicula que mas te gusta: \n1-Acción \n2-Comedia \n3-Drama \n4-Ciencia ficción \n");
            num = sc.nextInt();
            switch (num){
                case (1):System.out.println("Te recomiendo John Wick");
                    break;
                case (2):System.out.println("Te recomiendo Si Señor");
                    break;
                case (3):System.out.println("Te recomiendo Titanic");
                    break;
                case (4):System.out.println("Te recomiendo Volver al Futuro");
                    break;
            }
    }
}
