package com.ouchin.service;

import com.ouchin.dto.request.CyclistRequestDto;
import com.ouchin.dto.response.CyclistResponseDto;

import java.util.List;

public interface CyclistService {
    List<CyclistResponseDto> findAll();
    CyclistResponseDto findById(Long id);
    CyclistResponseDto create(CyclistRequestDto dto);
    CyclistResponseDto update(Long id, CyclistRequestDto dto);
    void delete(Long id);
    List<CyclistResponseDto> findByNationality(String nationality);
    List<CyclistResponseDto> findByTeam(String team);
}