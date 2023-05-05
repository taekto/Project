package com.ssafy.ssafit.repository;

import com.ssafy.ssafit.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    public Optional<User> selectUserById(String username) {
        List<User> users = em.createQuery("select u from User u where u.userName = :username", User.class)
                .setParameter("username", username)
                .getResultList();
        return users.stream().findAny();
    }

}
