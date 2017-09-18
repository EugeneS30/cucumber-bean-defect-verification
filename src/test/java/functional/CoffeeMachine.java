package functional;

public interface CoffeeMachine {
	
	boolean anyCcoffeesLeft();
	
	int coffeesLeft();
	
	void deposit(final int dollars);
	
	void pressCoffeeButton();
	
	void serveCoffee();
	
	boolean isCoffeeServed();

}
