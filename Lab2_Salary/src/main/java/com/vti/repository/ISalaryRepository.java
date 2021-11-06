package com.vti.repository;

import com.vti.entity.SalaryEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalaryRepository extends JpaRepository<SalaryEmployee, Short> {

}
