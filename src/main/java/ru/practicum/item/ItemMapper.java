package ru.practicum.item;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDto toItemDto(Item item);

    Item toItem(ItemDto itemDto);

}
