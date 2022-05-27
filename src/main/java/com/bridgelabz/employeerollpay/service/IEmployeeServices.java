package com.bridgelabz.employeerollpay.service;
import com.bridgelabz.employeerollpay.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeServices extends JpaRepository<Employee, Integer> {
}

