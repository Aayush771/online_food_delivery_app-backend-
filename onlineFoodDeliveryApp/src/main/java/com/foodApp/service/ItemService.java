package com.foodApp.service;

import java.util.List;

import com.foodApp.model.Item;
import com.foodApp.model.Resturant;

public interface ItemService {
	
	public Item addItem(Item i);
	
	public Item updateItem(Item i);
	
	public Item removeItem(Item i);
	
	public Item viewItem(Item i);
	
	public List<Item> viewAllItemResturant(Resturant res);

	public List<Item> viewAllItemByName(String name);
}
