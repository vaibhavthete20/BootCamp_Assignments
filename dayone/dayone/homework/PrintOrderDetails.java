package com.tut.dayone.homework;

import java.util.Scanner;

public class PrintOrderDetails {

	public static void main(String[] args) {
//		PrintOrderDetails Write a program that takes an order ID, item name, quantity,
//		and total cost as command line arguments and prints a sentence like "Order [ID]:
//		[Quantity] of [Item] for a total of Rs [Cost].

		System.out.println("Enter the details of item");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order id :");
		int orderId = sc.nextInt();
//		sc.nextLine();
		System.out.println("Enter item name :");
		String name = sc.nextLine();
		System.out.println("Enter a quantity of an item :");
		int quantity = sc.nextInt();
		int totalCost = quantity * 25;

		System.out.println("Order [ID]:" + orderId + " " + "[Quantity]:" + quantity + " of [Item] " + name+" "
				+ "for a total of Rs [Cost] " + totalCost);

	}

}
