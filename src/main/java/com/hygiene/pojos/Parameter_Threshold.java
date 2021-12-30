package com.hygiene.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Parameter_Threshold {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer param_id;
	@OneToMany(mappedBy = "pLow_thd", cascade = CascadeType.ALL)
	private List<Parameter_Master> lowerList = new ArrayList<Parameter_Master>();
	@OneToMany(mappedBy = "pUpp_thd", cascade = CascadeType.ALL)
	private List<Parameter_Master> upperList = new ArrayList<Parameter_Master>();

	public Integer getParam_id() {
		return param_id;
	}

	@OneToMany(mappedBy = "p_thd", cascade = CascadeType.ALL)
	private List<AQI_Date> aqiList = new ArrayList<AQI_Date>();

	public List<AQI_Date> getAqiList() {
		return aqiList;
	}

	public void setAqiList(List<AQI_Date> aqiList) {
		this.aqiList = aqiList;
	}

	public void setParam_id(Integer param_id) {
		this.param_id = param_id;
	}

	public List<Parameter_Master> getLowerList() {
		return lowerList;
	}

	public void setLowerList(List<Parameter_Master> lowerList) {
		this.lowerList = lowerList;
	}

	public List<Parameter_Master> getUpperList() {
		return upperList;
	}

	public void setUpperList(List<Parameter_Master> upperList) {
		this.upperList = upperList;
	}

}
