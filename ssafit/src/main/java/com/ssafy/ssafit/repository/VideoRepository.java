package com.ssafy.ssafit.repository;

import com.ssafy.ssafit.domain.Video;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class VideoRepository {
    private final EntityManager em;

    // 파트 별로 찾기
    public List<Video> findByPart(String part){
        return em.createQuery("select v from Video v where v.part = :part", Video.class)
                .setParameter("part", part)
                .getResultList();
    }

    // ID로 찾기
    public Video findById(Long id) {
        return em.find(Video.class, id);
    }


}
