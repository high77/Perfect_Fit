package com.ssafy.backend.domain.recording.service;

import com.ssafy.backend.domain.recording.dto.SingleCreateRequestDto;

import com.ssafy.backend.domain.recording.dto.SingleResponseDto;

import java.util.List;

public interface SingleService {

    //single recording 저장
    void createSingle(Long memberId, Long songId, SingleCreateRequestDto singleCreateRequestDto);

    // 내 single recording list 조회
    List<SingleResponseDto> getSingleList(Long memberId);

    SingleResponseDto getSingle(Long singleId);

}
