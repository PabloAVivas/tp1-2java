import java.util.Scanner;

public class imc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int alt, pes, imc;
        System.out.print("Introduce tu altura: \n");
        alt = sc.nextInt();
        System.out.print("Introduce tu peso \n");
        pes = sc.nextInt();
        pes = pes*10000;
        imc = pes/(alt*alt);
        System.out.println(imc);
        if (imc<19){
            System.out.println("Bajo peso");
        } else if (imc<25){
            System.out.println("Peso normal");
        } else if (imc<30){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obecidad");
        }

    }
}
