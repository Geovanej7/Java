import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro Carro1 = new Carro();
        System.out.println("carro1: digite a placa:");
        Carro1.placa = teclado.next();
        System.out.println("Digite a marca:");
        Carro1.marca = teclado.next();
        System.out.println("Digite o ano de fabricação:");
        Carro1.anoFabricação = teclado.nextInt();
        System.out.println("Digite o valor de venda:");
        Carro1.valorVenda = teclado.nextDouble();

        Carro Carro2 = new Carro();
        System.out.println("carro2: digite a placa:");
        Carro2.placa = teclado.next();
        System.out.println("Digite a marca:");
        Carro2.marca = teclado.next();
        System.out.println("Digite o ano de fabricação:");
        Carro2.anoFabricação = teclado.nextInt();
        System.out.println("Digite o valor de venda:");
        Carro2.valorVenda = teclado.nextInt();


        if(Carro1.equals(Carro2)){
            System.out.println("São iguais");
        }
        else{
        System.out.println("São diferentes");
        }
    }
}
