package com.mapstruct.spring.example.mapstructspring;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/item")
    public Item getItem() {
        return itemService.getItem();
    }

    @GetMapping("/itemDto")
    public ItemDto getItemDto() {
        return itemService.getItemDto();
    }
}
