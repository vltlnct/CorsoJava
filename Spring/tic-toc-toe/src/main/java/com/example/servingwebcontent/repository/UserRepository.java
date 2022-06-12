package com.example.servingwebcontent.repository;

import com.example.servingwebcontent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

