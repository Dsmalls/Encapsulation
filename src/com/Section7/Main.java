package com.Section7;

public class Main {
	// Encapsulation in Java is a mechanism of wrapping the data (variables) and code
	// acting on the data (methods) together as a single unit.
	// In encapsulation, the variables of a class will be hidden from other classes, and can be accessed
	// only through the methods of their current class. Therefore, it is also known as data hiding.

	// this is an example of improper encapsulation
	// I can change the fields where it will override the commands from the player class
    public static void main(String[] args) {
//	Player player = new Player();
//	player.name = "Keith";
//	player.health = 25;
//	player.weapon = "Sword";
//
//	int damage = 10;
//	player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 12;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 15;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Dez", 50, "Sword");
		System.out.println("Initial health is " + player.getHealth());
		System.out.println("================================================");

		Printer printer = new Printer(50, false);
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(5);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());


    }
}
