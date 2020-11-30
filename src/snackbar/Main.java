package snackbar;

public class Main 
{
	public static void main(String[] args)
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		// String name, int quantity, double cost, int vendingMachineId
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2, food.getId());
		Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		
		jane.buySnacks(soda.buySnack(3));

		System.out.println("Jane cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of Soda is " + soda.getQuantity());
		System.out.println();

		jane.buySnacks(pretzel.buySnack(1));

		System.out.println("Jane cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of Pretzels is " + pretzel.getQuantity());
		System.out.println();

		bob.buySnacks(soda.buySnack(2));

		System.out.println("Bob cash on hand $" + bob.getCashOnHand());
		System.out.println("Quantity of Soda is " + soda.getQuantity());
		System.out.println();

		jane.addCash(10);

		System.out.println("Jane cash on hand $" + jane.getCashOnHand());
		System.out.println();

		jane.buySnacks(chocolateBar.buySnack(1));

		System.out.println("Jane cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of Chocolate Bars is " + chocolateBar.getQuantity());
		System.out.println();

		pretzel.addQuantity(12);

		System.out.println("Quantity of Pretzels is " + pretzel.getQuantity());
		System.out.println();
		
		bob.buySnacks(pretzel.buySnack(3));

		System.out.println("Bob cash on hand $" + bob.getCashOnHand());
		System.out.println("Quantity of Pretzels is " + pretzel.getQuantity());
		System.out.println();
	}
}