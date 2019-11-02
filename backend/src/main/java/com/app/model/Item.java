package com.app.model;

public class Item {
	
	private Long itemId;
	private String itemName;
	
	public Item(Long id, String name) {
		// TODO Auto-generated constructor stub
		this.setItemId(id);
		this.setItemName(name);
	}
	
	public Item(){
		
	}
	
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	

}
