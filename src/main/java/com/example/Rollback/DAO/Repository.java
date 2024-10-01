package com.example.Rollback.DAO;

import com.example.Rollback.Entity.Rollback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Rollback, Integer> {
}
