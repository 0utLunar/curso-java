package com.devsuperior.worker.repositories;

import com.devsuperior.worker.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
