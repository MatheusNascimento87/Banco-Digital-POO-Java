# Projeto Banco-Digital usando POO em JAVA
Este é um projeto básico de simulação de operações bancárias, escrito em Java. Ele simula a criação de contas, depósitos, saques e transferências entre contas, utilizando conceitos de Programação Orientada a Objetos (POO).

## Estrutura do Projeto
O projeto contém as seguintes classes e interfaces principais:

- `Banco`: Classe que contém o nome do banco e uma lista de contas associadas a ele.
- `Cliente`: Representa um cliente do banco, contendo apenas o nome.
- `Conta`: Classe abstrata que define a estrutura básica de uma conta bancária (número, agência, saldo, cliente). Implementa a interface `InterfaceConta`.
  
    - `ContaCorrente`: Subclasse de Conta, representando uma conta corrente.
    - `ContaPoupanca`: Subclasse de Conta, representando uma conta poupança.

- `InterfaceConta`: Interface que define os métodos que toda conta bancária deve implementar (`sacar`, `depositar`, `transferir`, `imprimirExtrato`).
- `Main`: Classe principal que executa o programa e realiza as operações de teste.

## Funcionalidades

- Criação de contas: O sistema permite a criação de contas correntes e poupança para um cliente.
- Operações bancárias: O sistema possibilita:
  - Depósito de valores em uma conta.
  - Saque de valores de uma conta.
  - Transferência de valores entre contas.
  - Impressão de extratos.
  
## Exemplo de Uso
No arquivo Main.java, há um exemplo de como utilizar o sistema:
```bash
public class Main {
    public static void main(String[] args) {
        Cliente Matheus = new Cliente();
        Matheus.setNome("Matheus");
        
        Conta cc = new ContaCorrente(Matheus);
        Conta poupanca = new ContaPoupanca(Matheus);

        cc.depositar(1200);
        cc.transferir(350, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
```
## Explicação do Exemplo
- Um cliente chamado "Matheus" é criado.
- Duas contas são abertas para este cliente: uma conta corrente (ContaCorrente) e uma conta poupança (ContaPoupanca).
- Um depósito de R$ 1200 é realizado na conta corrente.
- Uma transferência de R$ 350 é feita da conta corrente para a conta poupança.
- Os extratos de ambas as contas são impressos.
## ⚙ Como usar
```bash
 # Clone o projeto
  - Faça um Fork do projeto
        ou
  $ git clone https://github.com/MatheusNascimento87/Banco-Digital-POO-Java.git
```
Compile e execute o projeto:

Compile o projeto Java e execute a classe Main.java para simular as operações bancárias.

## Melhorias Futuras
- Adicionar tratamento de exceções para operações inválidas (ex.: saque com saldo insuficiente).
- Implementar taxas para operações em contas correntes.
- Adicionar uma interface gráfica simples para interagir com o sistema bancário.
