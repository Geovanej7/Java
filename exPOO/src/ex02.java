/*Utilizando uma estrutura de repetição, complete o programa abaixo para imprimir todos os números de 80 a 340 e sempre que o número impresso for ímpar, imprima ao lado do número o texto “é ímpar”. Exemplo: 81 é ímpar. Caso o número seja par, só é necessário imprimir apenas o número. Exemplo: 82.
 */

public class ex02 {
    public static void main(String[] args){
for(int i = 80; i <= 340; i++){
    if(i %2 != 0){
        System.out.println(i + " é impar");
    }
    else {
        System.out.println(i);
    }
}

    }
    
}
