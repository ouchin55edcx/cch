package com.ouchin.service.impl;

import com.ouchin.dao.CyclistDao;
import com.ouchin.dto.request.CyclistRequestDto;
import com.ouchin.dto.response.CyclistResponseDto;
import com.ouchin.entity.Cyclist;
import com.ouchin.exception.EntityNotFoundException;
import com.ouchin.mapper.CyclistMapper;
import com.ouchin.service.CyclistService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Transactional
@Validated
@RequiredArgsConstructor
public class DefaultCyclistService implements CyclistService {

    private final CyclistDao cyclistDao;
    private final CyclistMapper mapper;

    @Override
    public List<CyclistResponseDto> findAll() {
        return cyclistDao.findAll()
                .stream()
                .map(mapper::toResponseDto)
                .toList();
    }

    @Override
    public CyclistResponseDto findById(Long id) {
        return cyclistDao.findById(id)
                .map(mapper::toResponseDto)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    @Override
    public CyclistResponseDto create(CyclistRequestDto dto) {
        Cyclist cyclist = mapper.toEntity(dto);
        Cyclist savedCyclist = cyclistDao.save(cyclist);
        return mapper.toResponseDto(savedCyclist);
    }

    @Override
    public CyclistResponseDto update(Long id, CyclistRequestDto dto) {
        Cyclist existingCyclist = cyclistDao.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));

        // Update the existing cyclist with new data
        existingCyclist.setLastName(dto.lastName());
        existingCyclist.setFirstName(dto.firstName());
        existingCyclist.setNationality(dto.nationality());
        existingCyclist.setBirthday(dto.birthday());
        existingCyclist.setTeam(dto.team());

        Cyclist updatedCyclist = cyclistDao.update(existingCyclist);
        return mapper.toResponseDto(updatedCyclist);
    }


    @Override
    public void delete(Long id) {
        Cyclist cyclist = cyclistDao.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
        cyclistDao.delete(cyclist);
    }

    @Override
    public List<CyclistResponseDto> findByNationality(String nationality) {
        return cyclistDao.findByNationality(nationality)
                .stream()
                .map(mapper::toResponseDto)
                .toList();
    }

    @Override
    public List<CyclistResponseDto> findByTeam(String team) {
        return cyclistDao.findByTeam(team)
                .stream()
                .map(mapper::toResponseDto)
                .toList();
    }
}
