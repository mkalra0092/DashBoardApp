package com.hygiene.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class BranchMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branchId;
	@Column(length = 30)
	private String branchName;
	@OneToMany(mappedBy = "branchId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Customer> custList = new ArrayList<>();

	public BranchMaster() {
		// TODO Auto-generated constructor stub
	}

	public BranchMaster(String branchName) {
		super();
		this.branchName = branchName;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<Customer> getCustList() {
		return custList;
	}

	public void setCustList(List<Customer> custList) {
		this.custList = custList;
	}

	@Override
	public String toString() {
		return "BranchMaster [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
}
