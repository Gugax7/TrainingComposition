package entities;

public class OrderItem {
	
	private int quantity;
	Product product = new Product();
	
	
	public OrderItem() {
	}


	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getSubtotal() {
		Double subtotal = quantity * product.getPrice();
		
		return subtotal;
	}


	public String toString() {
		return  product.toString()+ " " + "quantity = " + quantity + "]" ;
	}



}
