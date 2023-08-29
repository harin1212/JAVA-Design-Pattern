package factory_method;

import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Harin Kim");
		Product card2 = factory.create("Heungmin Son");
		Product card3 = factory.create("Kane");
		card1.use();
		card2.use();
		card3.use();

	}

}
