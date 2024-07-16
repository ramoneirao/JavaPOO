package cursopoo;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("===============================");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Dono " + this.getDono());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
        System.out.println("===============================");
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if ("CC".equals(t)){
            this.saldo = 50;
        } else if ("CP".equals(t)) {
            this.saldo = 150;
        }
        System.out.println("Conta aberta con sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pdoe ser fechada pois ainda tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Impossivel realizar o deposito em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar me conta fechada!"); 
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }
    
    //Métodos Especiais 

    public ContaBanco() {
    //Construtor
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
