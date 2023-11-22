package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.models.Item;
import com.demo.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public void saveItem(Item item) {
		itemRepository.save(item);
	}
	
	public List<Item> getAllItem() {
		return itemRepository.findAll();
	}
	
	public Optional<Item> getItemById(Long id) {
		return itemRepository.findById(id);
	}
	
	public void deleteId(Long id) {
		itemRepository.deleteById(id);
	}
}