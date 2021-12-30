package com.hygiene.pojos;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class AQI_Date {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aqi;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date date_time;

	@ManyToOne
	@JoinColumn(name = "c_id")
	private Customer cust_id;
	
	@ManyToOne
	@JoinColumn(name = "pthd_id")
	private Parameter_Threshold p_thd;
	
	public Parameter_Threshold getP_thd() {
		return p_thd;
	}

	public void setP_thd(Parameter_Threshold p_thd) {
		this.p_thd = p_thd;
	}

	public Integer getAqi() {
		return aqi;
	}

	public void setAqi(Integer aqi) {
		this.aqi = aqi;
	}

	public Customer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Customer cust_id) {
		this.cust_id = cust_id;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

	public AQI_Date(Customer cust_id, Date date_time) {
		super();
		this.cust_id = cust_id;
		this.date_time = date_time;

	}

	public AQI_Date() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AQI_Date [aqi=" + aqi + ", date_time=" + date_time + "]";
	}

}
