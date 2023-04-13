package ru.practicum.item;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter @ToString
class ItemDto {

    private Long id;
    private Long userId;
    private String url;
    private Set<String> tags = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemDto)) return false;
        return id != null && id.equals(((ItemDto) o).getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}