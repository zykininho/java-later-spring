package ru.practicum.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@Repository
public class UserRepositoryImpl implements UserRepository {

    private final HashMap<Long, User> users = new HashMap<>();
    private long userId = 0;

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User save(User user) {
        userId++;
        user.setId(userId);
        users.put(userId, user);
        return user;
    }
}
