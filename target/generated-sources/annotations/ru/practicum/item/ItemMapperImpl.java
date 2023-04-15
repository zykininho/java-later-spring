package ru.practicum.item;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-15T18:16:56+0600",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public ItemDto toItemDto(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDto itemDto = new ItemDto();

        itemDto.setId( item.getId() );
        itemDto.setUserId( item.getUserId() );
        itemDto.setUrl( item.getUrl() );
        Set<String> set = item.getTags();
        if ( set != null ) {
            itemDto.setTags( new LinkedHashSet<String>( set ) );
        }

        return itemDto;
    }

    @Override
    public Item toItem(ItemDto itemDto) {
        if ( itemDto == null ) {
            return null;
        }

        Item item = new Item();

        item.setId( itemDto.getId() );
        item.setUserId( itemDto.getUserId() );
        item.setUrl( itemDto.getUrl() );
        Set<String> set = itemDto.getTags();
        if ( set != null ) {
            item.setTags( new LinkedHashSet<String>( set ) );
        }

        return item;
    }
}
