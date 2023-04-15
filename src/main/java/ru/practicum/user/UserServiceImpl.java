package ru.practicum.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    @Override
    public List<UserDto> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(userMapper::toUserDto)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public UserDto saveUser(UserDto userDto) {
        return userMapper.toUserDto(repository.save(userMapper.toUser(userDto)));
    }

}