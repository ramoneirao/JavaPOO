package cursopoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ola, mundo!");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        //c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Vermelho";
        c2.destampar();
        c2.rabiscar();
        //c1.status();
    }
    
}
