package com.mapstruct.spring.example.mapstructspring;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ItemService {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    public ItemDto getItemDto() {
        Item item = itemRepository.getItem();
        ItemDto itemDto = itemMapper.toDto(item);
        log.info(itemDto);
        return itemDto;
    }

    public Item getItem() {
        ItemDto itemDto = itemRepository.getItemDto();
        Item item = itemMapper.toItem(itemDto);
        log.info(item);
        return item;
    }
}
