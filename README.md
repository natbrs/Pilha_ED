
<h1 align="center">
Pilha 🔋

ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ
## Introdução
A pilha armazena apenas a posição de uma de suas extremidades (chamada topo), que é o único local onde são realizadas todas as operações de entrada e saída. A operação de entrada de dados (sempre no topo da pilha ) é chamada push e a retirada (também sempre do topo) é chamada pop.

## Definição 

É uma estrutura de dados de tamanho variável, sendo que elementos são incluídos (empilhados) e/ou removidos (desempilhados) apenas pela extremidade topo.

## FILO (first-in, last-out)

Pilhas são listas lineares com disciplina de acesso FILO (first-in, last-out, ou, o primeiro a entrar é o último a sair).

## Alocação de Memória

- Alocação Estática: Em geral através de arranjo ou
vetor;
- Alocação Dinâmica: Utilizando ponteiro.

## Operações Básicas:

Teste de pilha vazia;
- Criação da pilha;
- Empilhamento;
- Desempilhamento;
- Acesso aos elementos da pilha;
- ✓ Topo
- ✓ Tamanho

## Pilha: Alocação Dinâmica

Considere a definição do tipo Pilha abaixo:
```
public class No {
    int dado;
    No proximo;
}
```

## Teste de Pilha Vazia

```
No topo;

public boolean pilhaVazia(){ 
	if(this.topo == null) {
	    return true;
	}else{
       return false;     
	}
}
```

## Empilhando um elemento (push)

```
No topo;

public void push(int e){
	No elemento = new No();
        elemento.dado = e;
            if (pilhapVazia() == true){
                topo = elemento;
            }else{
            elemento.proximo = top;
            topo = proximo;
            } 
	}
```

## Desempilhando um elemento (pop)

```
No topo;
   tipo pop() {
      se (pilhaVazia() == verdadeiro) {
          exceção(“Não há elementos para desempilhar”);
      }
      tipo valor = topo.dado;
      topo = topo.proximo;
      retorne valor;
   }

public int pop(){
        if(pilhaVazia() == true) {
            System.out.print("Zero elementos!");
	    }
       int valor = topo.dado;
       top = topo.proximo;
       return valor;
}
```

## Acessando elementos da pilha

Como estamos usando uma lista simplesmente encadeada podemos acessar todos os elementos da pilha, a partir do topo, sem ter a necessidade de desempilhá-los.

### Verificar o topo da pilha

```
No topo;

public int topo() { 
        if(pilhaVazia() == true){
            System.out.print("Zero elementos!");
        } 
        int valor = topo.dado;
        return valor;
    }
```

## Verificar o tamanho da pilha:

```
No topo;
   tipo tamanho() {
   int cont = 0;
      se (pilhaVazia() == falso) {
         No auxiliar = topo;
         cont = 1;
         enquanto (auxiliar.proximo != null) {
             cont = cont + 1;
         auxiliar = auxiliar.proximo;
   }
}
 retorne cont;
}
```

## Exemplo (pilha de inteiros):

```
public class exemplo {
   public static void main(String[] args) {
        Pilha p = new Pilha();
        p.push(5);
        p.push(4);
        p.push(3);
        int topo = p.topo();
             System.out.println(“Topo:”+topo);
             int tamanho = p.tamanho();
                  System.out.println(“Tamanho da Pilha:”+tamanho);
                  ...
  }
}
```


# 📝 Exercícios de Pilha com Java

- [x] Implemente uma função que imprima os elementos de uma Pilha.
- [x] Faça uma função que inverta a ordem dos elementos da Pilha.
- [x] Faça uma função para retornar o número de elementos da Pilha que possuem valor ímpar.
- [x] Faça uma função para retornar o número de elementos da Pilha que possuem valor par.
ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ
<div align="center">
    © Material fornecido por <a href="https://br.linkedin.com/in/icarofreitas">Prof° Ícaro de Paula Freitas</a></p>
</div>
