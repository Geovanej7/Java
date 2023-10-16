public class Carro {
    String placa;
    String marca;
    int anoFabricação;
    int valorVenda;

public Carro(){

}
public Carro(String placa, String marca, int anoFabricação, int valorVenda){

this.placa = placa;
this.marca = marca;
this.anoFabricação = anoFabricação;
this.valorVenda = valorVenda;
}

public boolean equals(Carro novo){
    return this.placa.equals(novo.placa);
}
}
