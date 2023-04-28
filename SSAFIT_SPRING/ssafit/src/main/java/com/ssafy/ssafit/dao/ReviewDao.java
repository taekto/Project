package com.ssafy.ssafit.dao;

import com.ssafy.ssafit.dto.Review;
import com.ssafy.ssafit.dto.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDao {

    List<Review> selectAll();

    void regist(Review review);

    void modify(Review review);

    Review detail(String reviewid);

    void remove(String reviewid);

    List<Review> selectByid(String id);

    void updateReviewCount(String id);

}
