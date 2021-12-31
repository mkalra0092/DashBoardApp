package com.hygiene.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parameter")
public class ParameterMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parameterId;
	@Column(length = 30)
	private int co2;
	private int temp;
	private int humidity;
	private int pm2;
	private int pm10;
	private int tvoc;

	@OneToOne(mappedBy = "pLowThd", cascade = CascadeType.ALL)
	private ParameterThreshold lowerList;
	@OneToOne(mappedBy = "pUppThd", cascade = CascadeType.ALL)
	private ParameterThreshold upperList;

	@OneToOne(mappedBy = "pMaster")
	private AQIDate aqiDate;

	public ParameterMaster() {
		// TODO Auto-generated constructor stub
	}

	public Integer getParameterId() {
		return parameterId;
	}

	public void setParameterId(Integer parameterId) {
		this.parameterId = parameterId;
	}

	public int getCo2() {
		return co2;
	}

	public void setCo2(int co2) {
		this.co2 = co2;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPm2() {
		return pm2;
	}

	public void setPm2(int pm2) {
		this.pm2 = pm2;
	}

	public int getPm10() {
		return pm10;
	}

	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}

	public int getTvoc() {
		return tvoc;
	}

	public void setTvoc(int tvoc) {
		this.tvoc = tvoc;
	}

	public ParameterThreshold getLowerList() {
		return lowerList;
	}

	public void setLowerList(ParameterThreshold lowerList) {
		this.lowerList = lowerList;
	}

	public ParameterThreshold getUpperList() {
		return upperList;
	}

	public void setUpperList(ParameterThreshold upperList) {
		this.upperList = upperList;
	}

	public AQIDate getAqiDate() {
		return aqiDate;
	}

	public void setAqiDate(AQIDate aqiDate) {
		this.aqiDate = aqiDate;
	}

	@Override
	public String toString() {
		return "ParameterMaster [parameterId=" + parameterId + ", co2=" + co2 + ", temp=" + temp + ", humidity="
				+ humidity + ", pm2=" + pm2 + ", pm10=" + pm10 + ", tvoc=" + tvoc + "]";
	}

	public ParameterMaster(int co2, int temp, int humidity, int pm2, int pm10, int tvoc) {
		super();
		this.co2 = co2;
		this.temp = temp;
		this.humidity = humidity;
		this.pm2 = pm2;
		this.pm10 = pm10;
		this.tvoc = tvoc;
	}

}
