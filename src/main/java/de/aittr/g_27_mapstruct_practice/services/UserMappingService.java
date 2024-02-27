package de.aittr.g_27_mapstruct_practice.services;

import de.aittr.g_27_mapstruct_practice.domain.User;
import de.aittr.g_27_mapstruct_practice.domain.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMappingService {
    UserDto mapEntityToDto(User entity);
    User mapDtoToEntity(UserDto dto);
}