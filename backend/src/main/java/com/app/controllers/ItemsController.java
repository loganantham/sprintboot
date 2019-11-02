package com.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Item;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ItemsController {
	
	private List<Item> items = createItems();
	
	@RequestMapping(value="/items", method = RequestMethod.GET, produces = "application/json")
	public List<Item> firstPage(){
		return items;
	}

	private static List<Item> createItems() {
		List<Item> items = new ArrayList<>();
		Item item = new Item(1L,"Bat");
		items.add(item);
		return items;
	}
	
	

}
