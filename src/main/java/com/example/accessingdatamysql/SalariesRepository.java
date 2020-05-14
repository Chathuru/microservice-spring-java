package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalariesRepository extends JpaRepository<Salaries, Integer> {
}
