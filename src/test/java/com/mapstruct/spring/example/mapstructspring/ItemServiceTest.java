package com.mapstruct.spring.example.mapstructspring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemService itemService;

    @Spy
    private ItemMapper itemMapper = Mappers.getMapper(ItemMapper.class);

    @Test
    void shouldReturnItemDto() {
        Item mockItem = new Item(1, "mockItem", 10);
        given(itemRepository.getItem()).willReturn(mockItem);
        ItemDto itemDto = itemService.getItemDto();
        assertThat(mockItem.getName()).isEqualTo(itemDto.getName());
    }

}
