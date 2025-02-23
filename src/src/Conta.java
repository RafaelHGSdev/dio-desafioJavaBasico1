public class Conta {
    String agencia, nomeCliente;
    int numeroConta;
    double saldo;


    public void alteraAgencia(String novaAgencia){
        agencia = novaAgencia;
    }
    public void alteraNomeCliente(String novoNome){
        nomeCliente =  novoNome;
    }
    public void alteraNumeroConta(int novoNumero){
        numeroConta = novoNumero;
    }
    public void alteraSaldo(double novoSaldo){
        saldo = novoSaldo;
    }


    //Imprime os dados da conta no terminal
    public void imprimirDadosConta(){
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);
    }


}
