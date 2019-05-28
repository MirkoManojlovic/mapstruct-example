package com.mapstruct.spring.example.mapstructspring;

public class ItemRepository {
    public ItemDto getItemDto() {
        return new ItemDto("item 1");
    }

    public Item getItem() {
        return new Item(1, "item 1", 20);
    }
}
