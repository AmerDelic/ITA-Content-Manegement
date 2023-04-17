package com.ita.itacontentmanagement.web.mapping;

import com.ita.itacontentmanagement.persistence.entity.User;
import com.ita.itacontentmanagement.web.dto.user.NewUserDto;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {

    User dtoToNewUser(@Valid NewUserDto dto);
}
