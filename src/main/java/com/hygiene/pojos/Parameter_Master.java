package com.hygiene.pojos;

import javax.persistence.*;

@Entity
@Table(name = "parameter")
public class Parameter_Master {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parameter_id;
	@Column(length = 30)
	private String parameter_name;
	private int value;

	@ManyToOne
	@JoinColumn(name = "pLow_thd")
	private Parameter_Threshold pLow_thd;

	@ManyToOne
	@JoinColumn(name = "pUpp_thd")
	private Parameter_Threshold pUpp_thd;

	public Parameter_Threshold getpLow_thd() {
		return pLow_thd;
	}

	public void setpLow_thd(Parameter_Threshold pLow_thd) {
		this.pLow_thd = pLow_thd;
	}

	public Parameter_Threshold getpUpp_thd() {
		return pUpp_thd;
	}

	public void setpUpp_thd(Parameter_Threshold pUpp_thd) {
		this.pUpp_thd = pUpp_thd;
	}

	public Parameter_Master(String parameter_name, int value) {
		super();
		this.parameter_name = parameter_name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Parameter_Master [parameter_id=" + parameter_id + ", parameter_name=" + parameter_name + ", value="
				+ value + "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Integer getParameter_id() {
		return parameter_id;
	}

	public void setParameter_id(Integer parameter_id) {
		this.parameter_id = parameter_id;
	}

	public String getParameter_name() {
		return parameter_name;
	}

	public void setParameter_name(String parameter_name) {
		this.parameter_name = parameter_name;
	}

	public Parameter_Master() {
		// TODO Auto-generated constructor stub
	}

}
