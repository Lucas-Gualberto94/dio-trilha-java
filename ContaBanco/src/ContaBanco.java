public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCompleto;
    private float saldo;


    public ContaBanco(int numero, String agencia, String nomeCompleto, float saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCompleto = nomeCompleto;
        this.saldo = saldo;
    }


    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public float getSaldo() {
        return saldo;
    }


}
