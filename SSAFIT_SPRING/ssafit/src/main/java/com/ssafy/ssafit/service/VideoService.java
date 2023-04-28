package com.ssafy.ssafit.service;

import com.ssafy.ssafit.dto.Video;

import java.util.List;

public interface VideoService{
    List<Video> selectAll();

    Video selectById(String youtubeid);

    List<Video> selectByView();

    List<Video> selectByPart(String part);
}
