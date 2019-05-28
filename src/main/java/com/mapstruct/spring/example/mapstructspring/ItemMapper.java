package com.mapstruct.spring.example.mapstructspring;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN,
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ItemMapper {
    ItemDto toDto(Item item);
    Item toItem(ItemDto itemDto);
}
