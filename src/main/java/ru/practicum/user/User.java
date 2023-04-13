package ru.practicum.user;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import ru.practicum.enums.UserState;

import javax.persistence.*;
import java.time.Instant;

@Slf4j
@Data
@Entity
@Table(name = "users", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "registration_date")
    private Instant registrationDate = Instant.now();

    @Enumerated(EnumType.STRING)
    private UserState state;

}