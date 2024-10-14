import java.util.Scanner;

public class calculadora_descuento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, des;
        System.out.print("Introduce el precio de tu producto: \n");
        num = sc.nextInt();
        System.out.print("Introduce el numero de que categoria eres: \n1-Estudiante \n2-Adulto \n3-Jubilado \n");
        des = sc.nextInt();
         switch (des){
            case 1:System.out.println("Su total con descuento es de: " + num*0.9);
                break;
            case 2:System.out.println("Su total con descuento es de: "+ num*0.95);
                break;
            case 3:System.out.println("Su total con descuento es de: "+ num*0.85);
                break;
        }
    }
}
