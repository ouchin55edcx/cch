package com.ouchin.service;

import com.ouchin.dao.CyclistDao;
import com.ouchin.dto.request.CyclistRequestDto;
import com.ouchin.dto.response.CyclistResponseDto;
import com.ouchin.entity.Cyclist;
import com.ouchin.mapper.CyclistMapper;
import com.ouchin.service.impl.DefaultCyclistService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class DefaultCyclistServiceTest {

    @Mock
    private CyclistDao cyclistDao;

    @Mock
    private CyclistMapper cyclistMapper;

    @InjectMocks
    private DefaultCyclistService cyclistService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void create_ShouldReturnCreatedCyclistResponseDto() {
        CyclistRequestDto requestDto = new CyclistRequestDto("mustapha", "ouchin", "Morroco", LocalDate.of(2004, 11, 22), "Team A");
        Cyclist cyclistEntity = new Cyclist(null, "mustapha", "ouchin", "Morroco", LocalDate.of(2004, 11, 22), "Team A");
        Cyclist savedCyclist = new Cyclist(1L, "mustapha", "ouchin", "Morroco", LocalDate.of(2004, 11, 22), "Team A");
        CyclistResponseDto responseDto = new CyclistResponseDto(1L, "mustapha", "ouchin", "Morroco", LocalDate.of(2004, 11, 22), "Team A");


        when(cyclistMapper.toEntity(requestDto)).thenReturn(cyclistEntity);
        when(cyclistDao.save(cyclistEntity)).thenReturn(savedCyclist);
        when(cyclistMapper.toResponseDto(savedCyclist)).thenReturn(responseDto);


        CyclistResponseDto result = cyclistService.create(requestDto);


        assertEquals(responseDto, result);
        verify(cyclistMapper).toEntity(requestDto);
        verify(cyclistDao).save(cyclistEntity);
        verify(cyclistMapper).toResponseDto(savedCyclist);


    }
}

















