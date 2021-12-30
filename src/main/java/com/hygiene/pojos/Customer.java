package com.hygiene.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cust_id;
	@Column(length = 30)
	private String cust_name;

	@ManyToOne
	@JoinColumn(name = "b_id")
	private Branch_Master branch_id;

	@OneToMany(mappedBy = "cust_id", cascade = CascadeType.ALL)
	private List<AQI_Date> aqiList = new ArrayList<AQI_Date>();

	public List<AQI_Date> getAqiList() {
		return aqiList;
	}

	public void setAqiList(List<AQI_Date> aqiList) {
		this.aqiList = aqiList;
	}

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Branch_Master getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Branch_Master branch_id) {
		this.branch_id = branch_id;
	}

	public Customer(String cust_name, Branch_Master branch_id) {
		super();
		this.cust_name = cust_name;
		this.branch_id = branch_id;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", branch_id=" + branch_id + "]";
	}

}
