package com.hygiene.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class ParameterThreshold {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paramId;
	@OneToOne
	@JoinColumn(name = "pLow_thd")
	private ParameterMaster pLowThd;

	@OneToOne
	@JoinColumn(name = "pUpp_thd")
	private ParameterMaster pUppThd;

	@OneToMany(mappedBy = "pThd", cascade = CascadeType.ALL)
	private List<AQIDate> aqiList = new ArrayList<>();

	public Integer getParamId() {
		return paramId;
	}

	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	public ParameterMaster getpLowThd() {
		return pLowThd;
	}

	public void setpLowThd(ParameterMaster pLowThd) {
		this.pLowThd = pLowThd;
	}

	public ParameterMaster getpUppThd() {
		return pUppThd;
	}

	public void setpUppThd(ParameterMaster pUppThd) {
		this.pUppThd = pUppThd;
	}

	public List<AQIDate> getAqiList() {
		return aqiList;
	}

	public void setAqiList(List<AQIDate> aqiList) {
		this.aqiList = aqiList;
	}

	
	
}
