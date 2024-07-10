package cursopoo;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Nao posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar(){  
        this.tampada = true;
        System.out.println("A caneta foi tampada!");
    }
    
    void destampar(){
        this.tampada = false;
        System.out.println("A caneta foi destampada!");
    }
}
