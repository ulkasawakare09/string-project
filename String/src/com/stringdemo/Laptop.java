//Diff bet object class equal() and String object equals()
package com.stringdemo;

public class Laptop {
	private String modelName;
	private double modelPrice;
	public Laptop() {
		super();
	}
	public Laptop(String modelName, double modelPrice) {
		super();
		this.modelName = modelName;
		this.modelPrice = modelPrice;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getModelPrice() {
		return modelPrice;
	}
	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}
	@Override
	public String toString() {
		return "Laptop [modelName=" + modelName + ", modelPrice=" + modelPrice + "]";
	}
	public boolean equals(Object obj)
	{
		Laptop l1 = (Laptop)obj;

	return this.modelName.equals(l1.modelName)&& this.modelPrice==l1.modelPrice;
}

public static void main(String[]args)
{
	Laptop l1 = new Laptop("Dell",500000);
	Laptop l2 = new Laptop("Hp",650000);
	Laptop l3 = new Laptop("Dell",500000);
	
	System.out.println(l1==l2);//false
	System.out.println(l1==l3);//false
	System.out.println(l1.equals(l3));//true

	

}

}
