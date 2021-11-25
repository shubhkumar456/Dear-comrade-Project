package com.example.Dear.comrade.Project.repository;

import com.example.Dear.comrade.Project.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBRepository extends JpaRepository<Laptop ,Long> {
}
