package com.training.day20.compare;

public class Fruit implements Comparable<Fruit>{
	
	private String fruitName;
	private String fruitDesc;
	private Integer quantity;
	
	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("[fruitName :" +fruitName);
		sb.append(",fruitDesc :" +fruitName);
		sb.append(",quantity :" +fruitName);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		int diff = 0;
		//diff = this.fruitName.compareTo(o.getFruitName());
		diff = this.getQuantity().compareTo(o.getQuantity());
		return diff;
	}

}
