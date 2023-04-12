package ru.practicum.user;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class User {
    private Long id;
    private String email;
    private String name;
}