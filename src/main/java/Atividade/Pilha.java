package Atividade;

import java.util.Scanner;

public class Pilha {
    No top;
    Scanner scan = new Scanner(System.in);
       
    // Verifica se a pilha está vazia
    public boolean pVazia(){ 
	if(this.top == null) {
	    return true;
	}else{
            return false;     
	}
    }

    // Verifica o topo da pilha
    public int pTopo() { 
        if(pVazia() == true){
            System.out.print("Zero elementos!");
        } 
        int elemento = top.dado;
        return elemento;
    }
	 
    // Realiza o empilhamento
    public void pPush(int v){
	No valor = new No();
        valor.dado = v;
            if (pVazia() == true){
                top = valor;
            }else{
            valor.prox=top;
            top=valor;
            } 
	}
        
    // Realiza o desempilhamento
    public int pPop(){
        if(pVazia() == true) {
            System.out.print("Zero elementos!");
	    }int elemento = top.dado;
                top = top.prox;
            return elemento;
    }
    
    // Realiza a inversão
    Pilha pInverter() {
	if (pVazia() == false){
	    Pilha pAux = new Pilha();
	    No aux = top;
	    while (aux.prox != null){
	        pAux.pPush(aux.dado);
	        aux = aux.prox;
            }
	    pAux.pPush(aux.dado);
	    return pAux;
	}
	return null;
    }
 
    // Imprimi os valores da pilha
    public static void main(String args[]) {
	Pilha p = new Pilha();		 
	//Ordena os valores
	p.pPush(2);
        p.pPush(5);
	p.pPush(7);
	p.pPush(9);

        Scanner menu = new Scanner (System.in);
        Scanner ler = new Scanner(System.in);
        String resposta = "";
        
        
        System.out.print("|-----------------------------|\n");
        System.out.print("|      Escolha uma opção      |\n");
	System.out.print("|-----------------------------|\n");
	System.out.print("| Opção 1 - Pilha normal      |\n");
	System.out.print("| Opção 2 - Pilha invertida   |\n");
	System.out.print("| Opção 3 - Valor par e ímpar |\n");
	System.out.print("| Opção 4 - Sair              |\n");
	System.out.print("|-----------------------------|\n");

	System.out.print("Opção: ");
        int op = menu.nextInt();

        if (op >= 5){
           System.out.print("Opção inválida! D:\n Tente novamente... \n");
           main(args);
        }

        switch(op){
        
        case 1:
        // Pilha normal
        System.out.print("Pilha normal: \n");
	    while (p.pVazia()== false) {
	    System.out.println(p.pPop());
	}

        System.out.print("Deseja continuar? (S/N) \n");
        resposta = ler.next();

        if (resposta.equals("S")){
           main(args);
        }else if(resposta.equals("N")){
           System.out.println("Volte sempre! :D");
           menu.close();
        }else{
           System.out.println("Resposta inválida! D:");
           System.out.println("Tente mais tarde...");
           menu.close();
        }
        break;

        case 2:
        // Pilha invertida
        System.out.print("Pilha invertida: \n");
            p = p.pInverter();
            while (p.pVazia()== false) {
	        System.out.println(p.pPop());
	    }

        System.out.print("Deseja continuar? (S/N) \n");
        resposta = ler.next();

        if (resposta.equals("S")){
           main(args);
        }else if(resposta.equals("N")){
           System.out.println("Volte sempre! :D");
           menu.close();
        }else{
           System.out.println("Resposta inválida! D:");
           System.out.println("Tente mais tarde...");
           menu.close();
        }
        break;

        case 3:
        // Par ou ímpar de uma pilha
        for(int i = p.pTopo(); i <= 10; i++){
            while(p.pVazia() == false){
                if(p.pTopo() % 2 == 0){
                    System.out.print(p.pPop()+ "-"+ "par"+"\n");
                }else{
                    System.out.print(p.pPop()+ "-"+ "impar"+"\n");
                }
            }
        }

        System.out.print("Deseja continuar? (S/N) \n");
        resposta = ler.next();

        if (resposta.equals("S")){
           main(args);
        }else if(resposta.equals("N")){
           System.out.println("Volte sempre! :D");
           menu.close();
        }else{
           System.out.println("Resposta inválida! D:");
           System.out.println("Tente mais tarde...");
           menu.close();
        }
        break;

        case 4:
        System.out.print("\n Volte sempre! :D ");
	    menu.close();	
        }
    }
}