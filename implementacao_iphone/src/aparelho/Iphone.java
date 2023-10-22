package aparelho;

import servicos.AparelhoTelefonico;
import servicos.Navegador;
import servicos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,ReprodutorMusical, Navegador {

    
    public void fazerChamada() {
        System.out.println("fazendo chamada");
    }

   
    public void navegarInternet() {
        System.out.println("navegando na internet");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("reproduzindo musica");
    }
    
}
