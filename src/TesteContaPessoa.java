public class TesteContaPessoa {
    
   public static void main(String args[]){
   
        Pessoa p = new Pessoa();
        Conta c = new Conta();
        
        p.setNome("Joao"); // setando valores.
        p.setEndereço("Rua: X");
        p.setCpf("123.456.789-12");
        p.setRg("12.345.678-2");
        
        c.setNumero(1);
        c.setSaldo(100);
        c.setLimite(1000);
        c.setTitular(p);
        
        c.getTitular().setNome("Jose");//Alterando o nome do titular
        
        System.out.printf("Numero: %d\n", c.getNumero());
        System.out.printf("Saldo: %.2f\n", c.getSaldo());
        System.out.printf("Limite: %.2f\n", c.getLimite());
        
        System.out.printf("Titular: %s\n", c.getTitular().getNome()); // Printando o nome do titular
        System.out.printf("CPF: %s\n", c.getTitular().getCpf()); // Printando o CPF do titular
        System.out.printf("RG: %s\n", c.getTitular().getRg()); // Printando o RG do titular
        
        System.out.printf("Nome do P: %s\n", p.getNome());
        
        
        
        
       
   }
    
}
