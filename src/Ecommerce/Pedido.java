package Ecommerce;

public class Pedido {
	  int idPedido;
	  String nomePedido;
	  String dataEmissao;
	  float valorTotal;
	  float precoItem;
	  int quantidade;

	  public Pedido(int idPedido, String dataEmissao, int quantidade, float precoItem) {
	    this.dataEmissao = dataEmissao;
	    SetValorTotal(quantidade, precoItem);
	    this.idPedido = idPedido;
	  }

	  public void SetValorTotal(int quantidade, float precoItem) {
	    this.precoItem = precoItem;
	    this.quantidade = quantidade;
	    valorTotal = quantidade * precoItem;
	  }
	}