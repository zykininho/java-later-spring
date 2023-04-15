package ru.practicum.item;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
class ItemDto implements Serializable {

    private Long id;
    private Long userId;
    private String url;
    private Set<String> tags;

}