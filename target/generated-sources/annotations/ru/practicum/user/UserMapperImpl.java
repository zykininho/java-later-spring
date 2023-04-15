package ru.practicum.user;

import java.time.Instant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-15T18:16:57+0600",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setEmail( user.getEmail() );
        if ( user.getRegistrationDate() != null ) {
            userDto.setRegistrationDate( user.getRegistrationDate().toString() );
        }
        userDto.setState( user.getState() );

        return userDto;
    }

    @Override
    public User toUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setFirstName( userDto.getFirstName() );
        user.setLastName( userDto.getLastName() );
        user.setEmail( userDto.getEmail() );
        if ( userDto.getRegistrationDate() != null ) {
            user.setRegistrationDate( Instant.parse( userDto.getRegistrationDate() ) );
        }
        user.setState( userDto.getState() );

        return user;
    }
}
