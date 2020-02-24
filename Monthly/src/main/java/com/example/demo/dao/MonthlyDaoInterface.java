package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Monthly;
@Repository
public interface MonthlyDaoInterface extends JpaRepository<Monthly, Long>{

}
