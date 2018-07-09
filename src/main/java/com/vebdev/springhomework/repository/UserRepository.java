package com.vebdev.springhomework.repository;

import com.vebdev.springhomework.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("from User u where u.email = :email")
    User getUserByEmail(@Param("email") String email);
}
