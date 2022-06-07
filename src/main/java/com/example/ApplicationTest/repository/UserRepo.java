package com.example.ApplicationTest.repository;

import com.example.ApplicationTest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

    User findByUsername(String username);

//    User deleteById(User user);
}
