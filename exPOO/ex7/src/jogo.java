public class jogo{
    
    private String titulo;
    private String produtora;
    private int anoLancamento;

    public String getTitulo(){
        return this.titulo;
    } 
    public String getProdutora(){
        return this.produtora;
    } 
    public int getAnoLancamento(){
        return this.anoLancamento;
    }
    

    public void setTitulo(String titulo){
        this.titulo = titulo;
    } 
    public void setProdutora(String produtora){
        this.produtora = produtora;
    }
    public void setAnoLancamento(String anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    
    public jogo (String titulo,String produtora, int anoLancamento ){
        this.titulo = titulo;
        this.produtora = produtora;
        this.anoLançamento = anoLançamento;
    }

    public jogo (){
    }
}
