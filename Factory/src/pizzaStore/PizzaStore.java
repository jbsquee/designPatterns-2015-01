package pizzaStore;

import pizza.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
	
			Pizza pizza;
			pizza = createPizza(type);			
			pizza.bake();
			pizza.cut();
			pizza.box();
			
			return pizza;
	}

	public abstract Pizza createPizza(String type);
	
}
