package Lesson6.hw.menu;

import java.util.ArrayList;

public abstract class Product {
	protected String name;
	protected Double price;
	protected ArrayList<String> ingredients;
	
	abstract Double getPrice();
	abstract String getName();
}
