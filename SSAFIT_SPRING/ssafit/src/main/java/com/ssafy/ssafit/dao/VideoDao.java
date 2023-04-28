package com.ssafy.ssafit.dao;

import com.ssafy.ssafit.dto.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoDao {
    List<Video> selectAll();

    Video selectById(String youtubeid);

    List<Video> selectByView();

    List<Video> selectByPart(String part);
}