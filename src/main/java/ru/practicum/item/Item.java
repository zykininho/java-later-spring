package ru.practicum.item;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
class Item {
    private Long id;
    private Long userId;
    private String url;
}