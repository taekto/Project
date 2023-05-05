package com.ssafy.ssafit.service;

import com.ssafy.ssafit.domain.Video;
import com.ssafy.ssafit.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    // 파트별 조회
    @Transactional
    public List<Video> findByPart(String part) {
        return videoRepository.findByPart(part);
    }

    public Video findById(Long id) {
        return videoRepository.findById(id);
    }

}
