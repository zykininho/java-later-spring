package ru.practicum.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(userMapper::toUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
        return userMapper.toUserDto(repository.save(userMapper.toUser(userDto)));
    }
}