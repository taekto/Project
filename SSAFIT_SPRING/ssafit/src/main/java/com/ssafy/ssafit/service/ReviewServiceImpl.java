package com.ssafy.ssafit.service;

import com.ssafy.ssafit.dao.ReviewDao;
import com.ssafy.ssafit.dto.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDao reviewDao;


    @Override
    public List<Review> selectAll() {
        return reviewDao.selectAll();
    }

    @Override
    public void regist(Review review) {
        reviewDao.regist(review);
    }

    @Override
    public void modify(Review review) {
        reviewDao.modify(review);
    }

    @Override
    public Review detail(String reviewid) {
       return reviewDao.detail(reviewid);
    }

    @Override
    public void remove(String reviewid) {
        reviewDao.remove(reviewid);
    }

    @Override
    public List<Review> selectById(String id) {
        return reviewDao.selectByid(id);
    }

    @Override
    public void updateReviewCount(String id) {
        reviewDao.updateReviewCount(id);
    }
}
