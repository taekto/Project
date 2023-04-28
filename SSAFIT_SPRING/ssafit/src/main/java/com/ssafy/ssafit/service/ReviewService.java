package com.ssafy.ssafit.service;

import com.ssafy.ssafit.dao.VideoDao;
import com.ssafy.ssafit.dto.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {

    List<Review> selectAll();

    void regist(Review review);

    void modify(Review review);

    Review detail(String reviewid);

    void remove(String reviewid);

    List<Review> selectById(String id);

    void updateReviewCount(String id);
}
