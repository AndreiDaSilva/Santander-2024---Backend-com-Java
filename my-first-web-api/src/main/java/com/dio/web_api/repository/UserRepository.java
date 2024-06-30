package com.dio.web_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dio.web_api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERES e.username = (:username)")    
    public User findByUsername(@Param("username") String username);
}
