package cursopoo;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Ola, mundo!");
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; Ponta é privado
        c1.carga = 80;
        //c1.tampada = true;
        c1.status();
    }
}
