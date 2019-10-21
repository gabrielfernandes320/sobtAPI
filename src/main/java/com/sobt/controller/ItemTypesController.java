package com.sobt.controller;

import com.sobt.ItemType;
import com.sobt.repository.ItemTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class ItemTypesController {

    @Autowired
    private ItemTypeRepository itemTypeRepository;

    @GetMapping("/itemTypes")   // GET Method for reading operation
    public List<ItemType> getAllItemTypes() {
        return itemTypeRepository.findAll();
    }

    @GetMapping("/itemTypes/{id}")
    public ItemType FindItemType(@PathVariable(value="id") long id){
        return itemTypeRepository.findById(id);
    }

    @PostMapping("/itemTypes")
    public ItemType SaveItemType(@RequestBody ItemType itemType){
        return itemTypeRepository.save(itemType);
    }

    @DeleteMapping("/itemType/{id}")
    public void deleteItemType (@PathVariable Long id){
        itemTypeRepository.deleteById(id);
    }

    @PutMapping("/itemType/{id}")
    public ItemType updateItemType(@PathVariable Integer id, @RequestBody ItemType itemType){
        return itemTypeRepository.save(itemType);

    }

}
