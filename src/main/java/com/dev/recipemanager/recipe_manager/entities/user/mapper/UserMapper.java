package com.dev.recipemanager.recipe_manager.entities.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dev.recipemanager.recipe_manager.entities.user.User;
import com.dev.recipemanager.recipe_manager.entities.user.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);
    User userDTOToUser(UserDTO dto);
    
}
