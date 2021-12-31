package com.hygiene.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygiene.pojos.BranchMaster;

public interface BranchRepository extends JpaRepository<BranchMaster, Integer> {

	BranchMaster findByBranchName(String city);

}
