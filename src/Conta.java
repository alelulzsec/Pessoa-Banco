public class Conta {
    private int numero;
    private float saldo, limite;
    
    private Pessoa titular;
    
    public void setNumero(int n){numero = n;}
   public void setSaldo(float s) {saldo = s;}
   public void setLimite(float l){limite = l;}
   
   public void setTitular(Pessoa p){titular = p;}
   
   public int getNumero(){ return numero;}
   public float getSaldo(){return saldo;}
   public float getLimite(){return limite;}
   
   //GET do Titular
   public Pessoa getTitular(){return titular;}
   

    
}
