package com.example.CRUDEntry.repository;

import com.example.CRUDEntry.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
