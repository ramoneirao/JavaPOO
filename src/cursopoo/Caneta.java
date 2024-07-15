package cursopoo;

public class Caneta {
    
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.tampar();
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo (String m){
        this.modelo = m;
    }
      
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public int getCarga(){
         return this.carga;
    }
    public void setCarga(int c){
        this.carga = c;
    }
    
    public void status(){
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Esta tampada? " + this.tampada);
        
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Nao posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    public void tampar(){  
        this.tampada = true;
        System.out.println("A caneta foi tampada!");
    }
    
    public void destampar(){
        this.tampada = false;
        System.out.println("A caneta foi destampada!");
    }
}
