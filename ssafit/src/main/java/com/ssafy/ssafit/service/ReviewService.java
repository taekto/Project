package com.ssafy.ssafit.service;

import com.ssafy.ssafit.domain.Review;
import com.ssafy.ssafit.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public void Registreview(Review review) {
        reviewRepository.Registreview(review);
    }

    public List<Review> getAllreview(Long reviewid) {
        return reviewRepository.getAllreview(reviewid);
    }

    public void Updatereview(Review review) {
        reviewRepository.Updatereview(review);
    }

    public void removereview(Review review) {
        reviewRepository.removereview(review);
    }

}
