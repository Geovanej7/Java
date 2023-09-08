public class metodos {
    public static void main (String [] args){
        String primeiroNome = "Geovane";
        String segundoNome = "José";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    
    }

   public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método " + primeiroNome.concat( " ").concat(segundoNome);
   }

}
