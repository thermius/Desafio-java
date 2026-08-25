# Desafio-java
Desafio em Java que converte uma lista dinâmica de Strings (Varargs) em um único array de char, classificando cada caractere em número, letra ou símbolo.

## 🎯 O Desafio
O objetivo principal é manipular a entrada de dados e realizar a conversão estruturada seguindo estes passos:
1. **Receber uma lista flexível de Strings** usando o recurso de Varargs (`String...`).
2. **Calcular o tamanho total acumulado** de todas as Strings recebidas.
3. **Alocar um único array de `char`** com a capacidade exata necessária.
4. **Mover cada caractere de cada String** da lista para o array de `char`.
5. **Analisar e exibir** se cada elemento do array é uma letra, um número ou um símbolo especial.

## 🧠 Conceitos Praticados
- **Varargs (`String...`)**: Permite passar um número indeterminado de parâmetros.
- **Conversão de Tipos**: Transferência de dados de `String` para `char[]`.
- **Alocação e Controle de Índices**: Gestão manual de posições no array.
- **Classe `Character`**: Verificação com `Character.isDigit()` e `Character.isLetter()`.

## 💻 Exemplo de Execução

```bash
thermius@arch: java main.java 
[ NOTA ] - Entrada recebida: ola, mundo, 55, ?, 
voce digito uma letra: o
voce digito uma letra: l
voce digito uma letra: a
voce digito uma letra: m
voce digito uma letra: u
voce digito uma letra: n
voce digito uma letra: d
voce digito uma letra: o
voce digito um numero: 5
voce digitou um numero: 5
voce digito um simbolo especial: ?
thermius@arch:

