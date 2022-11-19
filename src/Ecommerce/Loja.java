package Ecommerce;

import java.util.List;
import java.util.ArrayList;

public class Loja {
  String nomeLoja;

  List<Pedido> listaPedidos = new ArrayList<>();
  
  Funcionario funcionario;

  public Loja(String nomeLoja, Funcionario funcionario)
  {
    this.nomeLoja = nomeLoja;
    this.funcionario = funcionario;
  }

  public void inserirPedido(int idPedido, String dataEmissao, int quantidade, float precoItem)
  {
	Pedido pedido = new Pedido(idPedido, dataEmissao, quantidade, precoItem);
    System.out.println("\n ***Método Inserir Pedido*** ");
    listaPedidos.add(pedido);
    int index = listaPedidos.indexOf(pedido);
    System.out.println("Pedido '" + (index+1) + "' inserido na lista com sucesso!");
  }

  public void buscarPedido(int idPedido)
  {	
	
	System.out.println("\n --------Método Buscar Pedido-------- ");
    
	System.out.println("--------------Pedido: " + idPedido +"--------------");
	System.out.println("Codigo do pedido: " + listaPedidos.get(idPedido - 1).idPedido);
	System.out.println("Data de emissão: " + listaPedidos.get(idPedido - 1).dataEmissao);
	System.out.println("Valor total: R$" + listaPedidos.get(idPedido - 1).valorTotal);
	
  }

  public void removerPedido(int idPedido)
  {	  
    System.out.println("\n **Método Remover Pedido*** ");
    listaPedidos.remove(idPedido - 1);
    System.out.println("Pedido '" + idPedido + "' removido da lista com sucesso!");

  }
}