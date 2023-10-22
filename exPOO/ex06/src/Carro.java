public class Carro {
    String placa;
    String marca;
    int anoFabricação;
    double valorVenda;

public Carro(){

}
public Carro(String placa, String marca, int anoFabricação, double valorVenda){

this.placa = placa;
this.marca = marca;
this.anoFabricação = anoFabricação;
this.valorVenda = valorVenda;
}

public boolean equals(Carro novo){
    return this.placa.equals(novo.placa);
}
}
