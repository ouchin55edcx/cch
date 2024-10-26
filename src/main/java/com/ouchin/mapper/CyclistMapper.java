package com.ouchin.mapper;

import com.ouchin.dto.request.CyclistRequestDto;
import com.ouchin.dto.response.CyclistResponseDto;
import com.ouchin.entity.Cyclist;
import org.springframework.stereotype.Component;

@Component
public class CyclistMapper {

    public CyclistResponseDto toResponseDto(Cyclist cyclist) {
        return new CyclistResponseDto(
                cyclist.getId(),
                cyclist.getLastName(),
                cyclist.getFirstName(),
                cyclist.getNationality(),
                cyclist.getBirthday(),
                cyclist.getTeam()
        );
    }

    public Cyclist toEntity(CyclistRequestDto dto) {
        Cyclist cyclist = new Cyclist();
        cyclist.setLastName(dto.lastName());
        cyclist.setFirstName(dto.firstName());
        cyclist.setNationality(dto.nationality());
        cyclist.setBirthday(dto.birthday());
        cyclist.setTeam(dto.team());
        return cyclist;
    }
}