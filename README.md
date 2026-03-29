# 📱 SimpleBankProject

O **SimpleBankProject** é um sistema bancário simples desenvolvido em **Java puro**, criado para demonstrar a aplicação prática de conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

---

## 📋 Descrição

O projeto consiste em uma aplicação de console que simula um ambiente bancário. Ele permite a gestão de contas correntes e poupanças, aplicando regras de negócio específicas para cada tipo através de interfaces e polimorfismo.

### 🎯 Funcionalidades

* **✅ Criar Conta:**
    * **Conta Corrente:** Aplica uma taxa de serviço de 1% sobre as operações.
    * **Conta Poupança:** Oferece um rendimento fixo de 6.7%.
* **✅ Operações Bancárias:**
    * **Depósito:** Adiciona saldo à conta considerando as taxas/rendimentos.
    * **Saque:** Remove valor com validação de saldo insuficiente.
    * **Visualizar Saldo:** Exibição detalhada dos dados do cliente e saldo atual.
* **✅ Tratamento de Erros:**
    * Validação de entradas (valores negativos).
    * Lançamento de exceção customizada: `ValorInvalidoException`.

---

## 🔍 Estrutura das Classes

O design do sistema foi pensado para ser extensível e organizado:

| Classe/Interface | Função |
| :--- | :--- |
| `Account` | **Classe Base** com os atributos do titular (Nome, Senha, Email). |
| `OperationsBalance` | **Extensão de Account** que contém a lógica de movimentação financeira. |
| `TaxAccount` | **Interface** que define o contrato para cálculo de taxas e rendimentos. |
| `CurrentAccount` | Implementação da interface para regras de Conta Corrente. |
| `SavingsAccount` | Implementação da interface para regras de Conta Poupança. |

---

## 💻 Como Usar

### Pré-requisitos
* Java 8 ou superior instalado.
* Compilador Java (`javac`) configurado no seu PATH.

### Executando a Aplicação

1. **Compile o projeto:**
```bash
javac -d . src/entities/*.java src/services/*.java src/exceptions/*.java src/main/*.java
```

2. **Execute a aplicação:**
```bash
java main.Application
```

## 📝 Exemplo de Uso

```plaintext
------Welcome the bank------

Account Type: 

1- [Current Account]
2- [Savings Account]

Choose: 1

Name: João Silva
Password: 12345
Email: joao@email.com
Balance: 1000.00

✅ Current Account created successfully!

========== OPERATIONS ==========

1 - Deposit
2 - Withdraw
3 - View Balance
4 - Exit

Choose an option: 1

Amount to deposit: 500
Deposit successfully!

========== ACCOUNT INFO ===========

Name:     João Silva
Email:    joao@email.com
Balance:  R$ 1490.50
===================================
```

## 🚀 Melhorias Sugeridas (Roadmap)

* [ ] Autenticação: Sistema de login com validação de senha e sessão.
* [ ] Histórico: Registro de transações para emissão de extrato.
* [ ] Persistência: Salvar dados em um Banco de Dados (SQL) ou arquivos.
* [ ] Validações: Regras para formato de e-mail e requisitos de senha.
* [ ] Interface Gráfica: Implementar GUI com Swing ou JavaFX.
* [ ] Qualidade: Implementar testes unitários com JUnit.

## 🛠 Tecnologias Utilizadas

* Linguagem: Java 8+
* Paradigma: Orientação a Objetos
* Conceitos: Herança, Interfaces, Polimorfismo e Custom Exceptions

## 👨‍💻 Autor

SimpleBankProject - Desenvolvido por: 

[Regys Eduardo Mendes Da Silva].

## 📄 Licença

Este projeto é livre para fins educacionais e de estudo.