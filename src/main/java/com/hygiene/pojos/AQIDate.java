package com.hygiene.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class AQIDate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aqiId;

//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@Temporal(TemporalType.DATE)
	private Date dateTime;

	@ManyToOne
	@JoinColumn(name = "c_id")
	private Customer custId;

	@ManyToOne
	@JoinColumn(name = "pthd_id")
	private ParameterThreshold pThd;

	@OneToOne
	@JoinColumn(name = "measurement_value")
	private ParameterMaster pMaster;

	public Integer getAqiId() {
		return aqiId;
	}

	public void setAqiId(Integer aqiId) {
		this.aqiId = aqiId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public ParameterThreshold getpThd() {
		return pThd;
	}

	public void setpThd(ParameterThreshold pThd) {
		this.pThd = pThd;
	}

	public ParameterMaster getpMaster() {
		return pMaster;
	}

	public void setpMaster(ParameterMaster pMaster) {
		this.pMaster = pMaster;
	}

	public AQIDate(Date dateTime) {
		super();
		this.dateTime = dateTime;
	}

	public AQIDate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AQI_Date [aqiId=" + aqiId + ", dateTime=" + dateTime + "]";
	}

}
