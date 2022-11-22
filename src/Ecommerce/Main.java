package Ecommerce;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int alternativa = 0;
		//Instanciando funcionario e criando a loja
		Funcionario f01 = new Funcionario("Roger Medeiros", 202201);
	    Loja ecommerce = new Loja("Ecommerce pós pandemia", f01);
	    

	    System.out.println("--------------Nome da Loja--------------");
	    System.out.println(ecommerce.nomeLoja + "\n");
	    System.out.println("Gerente: " + ecommerce.funcionario.nome);
	    
		while(alternativa!=4)
		{
			System.out.println("\n--------------MENU--------------");
		    System.out.println("Escolha uma opção: ");
		    System.out.println("1- Inserir Pedido");
		    System.out.println("2- Buscar Pedido");
		    System.out.println("3- Remover pedido");
		    System.out.println("4- Sair");
		    System.out.println("---------------------------------");
		    System.out.print("Seleciona uma opção: ");
		    alternativa = ler.nextInt();
		    
		    if(alternativa == 1)
		    {
		    	System.out.println("Digite o codigo do pedido:");
		    	int idPedido = ler.nextInt();
		    	System.out.println("\nInsira a data de emissao do pedido:");
		    	String DataEmissao = ler.next();
		    	System.out.println("\nInsira a quantidade de itens do pedido:");
		    	int quantidade = ler.nextInt();
		    	System.out.println("\nInsira o preco por item do pedido:");
		    	float precoItem = ler.nextFloat();
		    	
		    	ecommerce.inserirPedido(idPedido, DataEmissao, quantidade, precoItem);
		    }	
		    if(alternativa == 2)
		    {
		    	System.out.println("\nDigite o numero do pedido que voce deseja encontrar:");
		    	int idPedido = ler.nextInt();
		    	ecommerce.buscarPedido(idPedido);
		    }
		    if(alternativa == 3)
		    {
		    	System.out.println("\nDigite o codigo do pedido que voce deseja remover:");
		    	int idPedido = ler.nextInt();
		    	ecommerce.removerPedido(idPedido);
		    }
		    if(alternativa == 4)
		    {
		    	System.out.println("\nFechando o sistema...");
		    	ler.close();
		    	break;
		    }
		    else if(alternativa < 1 || alternativa > 4)
		    {
		    	System.out.println("\nEscolha invalida, Escolha novamente.\n");
		    }
		}
		System.exit(0);

	  }
}