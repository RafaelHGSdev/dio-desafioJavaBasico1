# Desafio DIO - Trilha Java Básico
Desafio para a trilha de bootcamp em JAVA Oferecido pela DIO.

## Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revise sobre regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

### Solução Implementada
Classe Conta
```
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

```

Classe ContaTerminal

```
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta contaCliente = new Conta();

        //Captura os dados de entrada do usuário
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();
        contaCliente.alteraNomeCliente(nome);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        contaCliente.alteraAgencia(agencia);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroDaConta = scanner.nextInt();
        contaCliente.alteraNumeroConta(numeroDaConta);

        System.out.println("Por favor, digite o seu Saldo:");
        double saldoCliente = scanner.nextDouble();
        contaCliente.alteraSaldo(saldoCliente);

        contaCliente.imprimirDadosConta();


    }
}
```

## Notas do Desenvolvedor
Hoje sou formado em ciêcia da computação e
já tive algumas interações com a linguagem JAVA, mas desejo me aprofundar nos estudos.
Portanto faço os exercícios da maneira que é proposto sem uso de "exageros" e
de acordo com o módulo (como tratamento de erros ou orientação a objetos com métodos de getter/setter, encapsulamento e etc)
É um dos motivos pelas quais estou postando também os exercícios iniciais em uma conta secundária do github.

Nota2: Agradeço a oportunidade de revisar a linguagem Java, desde seus conceitos básicos e espero logo poder me aprofundar para desenvolvimento com foco em backend, abraços para a equipe DIO!
