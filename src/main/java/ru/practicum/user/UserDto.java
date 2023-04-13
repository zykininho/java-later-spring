package ru.practicum.user;

import ru.practicum.enums.UserState;

import java.text.SimpleDateFormat;
import java.time.Instant;

public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String registrationDate = new SimpleDateFormat("yyyy.MM.dd, hh:mm:ss").format(Instant.now());
    private UserState state;

}