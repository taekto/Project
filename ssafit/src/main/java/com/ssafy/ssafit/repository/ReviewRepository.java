package com.ssafy.ssafit.repository;

import com.ssafy.ssafit.domain.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewRepository {
    private final EntityManager em;

    public void Registreview(Review review) {
        em.persist(review);
    }

    public List<Review> getAllreview(Long videoid) {
        return em.createQuery("select r from Review r where r.video.id = :videoid")
                .setParameter("videoid", videoid)
                .getResultList();
    }

    public void Updatereview(Review review) {
        Review findreview = em.find(Review.class, review.getId());
        findreview.setTitle(review.getTitle());
        findreview.setContent(review.getContent());
    }

    public void removereview(Review review) {
        Review findreview = em.find(Review.class, review.getId());
        em.remove(findreview);
    }


}
