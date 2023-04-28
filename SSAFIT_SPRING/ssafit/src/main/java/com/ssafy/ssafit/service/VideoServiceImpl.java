package com.ssafy.ssafit.service;

import com.ssafy.ssafit.dao.VideoDao;
import com.ssafy.ssafit.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDao videoDao;

    @Override
    public List<Video> selectAll() {
        return videoDao.selectAll();
    }

    @Override
    public Video selectById(String youtubeid) {
        return videoDao.selectById(youtubeid);
    }

    @Override
    public List<Video> selectByView() {
        return videoDao.selectByView();
    }

    @Override
    public List<Video> selectByPart(String part) {
        return videoDao.selectByPart(part);
    }
}
