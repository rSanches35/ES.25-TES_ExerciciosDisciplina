# ES.25 — Teste de Software

Este repositório contém os exercícios desenvolvidos para a disciplina **ES.25 - Teste de Software**.

**Tecnologias utilizadas:**  
- Java  
- JUnit 5

## 📌 Atividades

### 📂 [04.15] Atividade Senha — *Sistema de Validação de Senhas Seguras*

**Contexto:**
Você foi contratado por uma fintech brasileira para desenvolver um módulo de validação de senhas que será utilizado na criação de contas de usuário no aplicativo. O cliente quer garantir que todas as senhas cadastradas atendam a critérios rigorosos de segurança.

Requisitos Funcionais: O sistema deve validar senhas com as seguintes regras:

- Mínimo de 8 caracteres.
- Pelo menos uma letra maiúscula.
- Pelo menos uma letra minúscula.
- Pelo menos um número.
- Pelo menos um caractere especial (ex: !@#$%^&*).
- Não pode conter espaços em branco.

---

### 📂 [05.20] Atividade Particionamento — *Particionamento de Equivalência*

### Exercício 1. Exibir Calendário

**Contexto:**
Aplicar a técnica de Particionamento de Equivalência para derivar casos de teste que verifiquem corretamente a funcionalidade Cal() para exibição de calendários no Linux. A atividade visa garantir que as três formas principais de chamada da função *getCalendario()* funcionem adequadamente:

| Parâmetro(s) de Entrada               | Calendário Exibido                   |
|---------------------------------------|--------------------------------------|
| getCalendario()                       | Calendário do mês atual              |
| getCalendario(String ano)             | Calendário completo do ano informado |
| getCalendario(String mes, String ano) | Calendário do mês e ano informados   |

> Exemplo: `getCalendario("2025", "janeiro")`

**Janeiro de 2025**

| Dom | Seg | Ter | Qua | Qui | Sex | Sab |
|-----|-----|-----|-----|-----|-----|-----|
|     |     |     |  1  |  2  |  3  |  4  |
|  6  |  7  |  8  |  9  |  10 |  11 |  12 |
|  13 |  14 |  15 |  16 |  17 |  18 |  19 |
|  20 |  21 |  22 |  23 |  24 |  25 |  26 |
|  27 |  28 |  29 |  30 |  31 |     |     |

---

### Exercício 2. Cálculo de IRPF

**Contexto:**
Aplicar a técnica de Particionamento de Equivalência para derivar casos de teste que verifiquem corretamente o cálculo do Imposto de Renda de Pessoa Física (IRPF) com base na tabela vigente em 2022. A atividade visa garantir que diferentes faixas salariais sejam corretamente tributadas de acordo com suas respectivas alíquotas e deduções.

> Fórmula: `IRPF = (salário × alíquota) - parcela a deduzir`

Tabela de faixas (partições de equivalência):

| Faixa de Renda (R$)          | Alíquota (%) | Parcela a Deduzir (R$)  |
|------------------------------|--------------|-------------------------|
| Até 1.903,98                 | Isento       | -                       |
| De 1.903,99 até 2.826,65     | 7,5%         | 142,80                  |
| De 2.826,66 até 3.751,05     | 15%          | 354,80                  |
| De 3.751,06 até 4.664,68     | 22,5%        | 636,13                  |
| Acima de 4.664,68            | 27,5%        | 869,36                  |

---











