package com.hygiene.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer custId;
	@Column(length = 30)
	private String custName;
	
	@Column(length = 10)
	private String phone;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@ManyToOne
	@JoinColumn(name = "b_id")
	private BranchMaster branchId;

	@OneToMany(mappedBy = "custId", cascade = CascadeType.ALL)
	private List<AQIDate> aqiList = new ArrayList<>();

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName) {
		super();
		this.custName = custName;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public BranchMaster getBranchId() {
		return branchId;
	}

	public void setBranchId(BranchMaster branchId) {
		this.branchId = branchId;
	}

	public List<AQIDate> getAqiList() {
		return aqiList;
	}

	public void setAqiList(List<AQIDate> aqiList) {
		this.aqiList = aqiList;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
}
