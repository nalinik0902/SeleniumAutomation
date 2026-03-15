package com.example.app.service;

import com.example.app.entity.Item;
import com.example.app.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Transactional
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Transactional
    public Item update(Long id, Item updated) {
        return itemRepository.findById(id)
                .map(existing -> {
                    existing.setName(updated.getName());
                    existing.setDescription(updated.getDescription());
                    return itemRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    }

    @Transactional
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
