import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            valorDoce = mesada; 

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;

        }  
        System.out.println("mesada :" + mesada);    
        System.out.println("Juninho gastou toda sua mesada com doces");
    }


private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2, 15);
}
}