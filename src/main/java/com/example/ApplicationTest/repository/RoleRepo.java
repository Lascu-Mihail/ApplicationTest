package com.example.ApplicationTest.repository;
import com.example.ApplicationTest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long>{

    Role findByName(String name);


}
