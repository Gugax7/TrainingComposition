package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	List<OrderItem> itens = new ArrayList<>();
	
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public List<OrderItem> getItens() {
		return itens;
	}
	public void addItens(OrderItem item) {
		itens.add(item);
	}
	public void removeItens(OrderItem item) {
		itens.remove(item);
	}
	public Double totalSum() {
		double x = 0;
		for(int i = 0; i < itens.size(); i++) {
			x+= itens.get(i).getSubtotal();
		}
		return x;
	}
	
	public void getSList() {
		
		for(OrderItem x : itens) {
			System.out.println(x.toString());
		}
		
	}

}
