import java.util.Scanner;

public class exFuncoes01{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número:");
        int x = teclado.nextInt();

        System.out.println("Informe outro número:");
        int y = teclado.nextInt();

        System.out.println("A soma é" + testeSoma(x,y));

    }

public static int testeSoma(int x, int y){

    int z = x + y;
    return z;
}



}
