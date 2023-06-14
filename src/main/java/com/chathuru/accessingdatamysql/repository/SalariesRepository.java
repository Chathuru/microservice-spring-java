package com.chathuru.accessingdatamysql.repository;

import com.chathuru.accessingdatamysql.model.entity.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalariesRepository extends JpaRepository<Salaries, Integer> {
}
