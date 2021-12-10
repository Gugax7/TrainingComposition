package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {
	
	public static void main(String[]args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date moment = new Date();
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (dd/MM/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(moment, OrderStatus.valueOf(status));
		
		System.out.println("How many itens to this order?");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Enter #" + i +" item data: ");
			System.out.print("Product name: ");
			String Pname = sc.next();
			System.out.print("Product price:");
			Double Pprice = sc.nextDouble();
			System.out.print("Product quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(Pname, Pprice);
			OrderItem item = new OrderItem(quantity, product);
		
			order.addItens(item);
		}
		Date x1 = new Date();
		System.out.println();
		System.out.println("Client name = " + name);
		System.out.println("Order date = " + sdf1.format(x1));
		System.out.println("Order items: ");
		order.getSList();
		System.out.println("total = " + order.totalSum());
		
		
		
		
		
	}

}
