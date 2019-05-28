package com.mapstruct.spring.example.mapstructspring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = {ItemMapper.class})
public class ItemServiceTest {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemService itemService;

    @Spy
    private ItemMapper itemMapper;

    @Test
    void shouldReturnItemDto() {
        Item mockItem = new Item(1, "mockItem", 10);
        given(itemRepository.getItem()).willReturn(mockItem);
        ItemDto itemDto = itemService.getItemDto();
        assertThat(mockItem.getName()).isEqualTo(itemDto.getName());
    }

}
