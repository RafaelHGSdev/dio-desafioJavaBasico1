
/*
Desafio Proposto

- Objetivo: Conhecer e importar a classe Scanner

- Exibir mensagens para o nosso usuário
- Obter pela scanner os valores digitados no terminal
- Exibir a mensagem de conta criada


Nota do Desenvolvedor: Hoje sou formado em ciêcia da computação e
já tive algumas interações com a linguagem JAVA, mas desejo me aprofundar nos estudos.
Portanto faço os exercícios da maneira que é proposto sem uso de "exageros" e
de acordo com o módulo (como tratamento de erros ou orientação a objetos com métodos de getter/setter, encapsulamento e etc)
É um dos motivos pelas quais estou postando também os exercícios iniciais em uma conta secundária do github.

Nota2: Agradeço a oportunidade de revisar a linguagem Java, desde seus conceitos básicos e espero logo poder me aprofundar para desenvolvimento com foco em backend, abraços para a equipe DIO!
 */

import java.util.Scanner;

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