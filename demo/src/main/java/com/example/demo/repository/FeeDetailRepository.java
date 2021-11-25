package com.example.demo.repository;

import com.example.demo.domain.FeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeeDetailRepository extends CrudRepository<FeeDetail, Long> {


    List<FeeDetail> findByLoanId(String loanId);
}
