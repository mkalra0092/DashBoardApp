package com.hygiene.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch_Master {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branch_id;
	@Column(length = 30)
	private String branch_name;
	@OneToMany(mappedBy = "branch_id", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Customer> cust_list = new ArrayList<Customer>();

	public Integer getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public List<Customer> getCust_list() {
		return cust_list;
	}

	public void setCust_list(List<Customer> cust_list) {
		this.cust_list = cust_list;
	}

	public Branch_Master(String branch_name, List<Customer> cust_list) {
		super();
		this.branch_name = branch_name;
		this.cust_list = cust_list;
	}

	public Branch_Master() {
		super();
	}

	@Override
	public String toString() {
		return "Branch_Master [branch_id=" + branch_id + ", branch_name=" + branch_name + ", cust_list=" + cust_list
				+ "]";
	}

}
