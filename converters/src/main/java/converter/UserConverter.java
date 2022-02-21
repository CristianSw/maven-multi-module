package converter;

import domain.UserCommand;
import entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    UserCommand userToUserCommand(User user);

    User UserCommandToUser(UserCommand userCommand);
}
