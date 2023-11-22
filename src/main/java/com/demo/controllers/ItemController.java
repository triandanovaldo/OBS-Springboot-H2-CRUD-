package com.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.models.Item;
import com.demo.service.ItemService;

@RestController
public class ItemController {

		@Autowired
		ItemService itemService;
		
		@PostMapping("/saveItem")
		public String saveItem(@RequestBody Item item) {
			itemService.saveItem(item);
			return "Item saved ...";
		}
		
		@GetMapping("/getAllItems")
		public List<Item> getAllItem() {
			return itemService.getAllItem();
		}
		
		@GetMapping("/getItem/{id}")
		public Optional<Item> getItem(@PathVariable("id") Long id) {
			return itemService.getItemById(id);
		}
		
		@DeleteMapping("deleteItem/{id}")
		public void deleteItem(@PathVariable("id") Long id) {
			itemService.deleteId(id);
		}
		
		
}
