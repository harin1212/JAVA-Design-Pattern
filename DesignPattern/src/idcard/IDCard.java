package idcard;

import framework.Product;

public class IDCard extends Product {
	private String owner;

	public IDCard(String owner) {
		System.out.println("Create a card for " + owner);
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("Use " + this);
	}

	@Override
	public String toString() {
		return "[IDCard : " + owner + "]";
	}

	public String getOwner() {
		return owner;
	}

}
