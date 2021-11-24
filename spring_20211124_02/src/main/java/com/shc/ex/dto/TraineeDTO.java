package com.shc.ex.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class TraineeDTO {
	
	private long t_tunumber;
	private String t_name;
	private int t_age;
	private int t_phone;
	private String t_gender;
	private Date t_birthday;
	private String t_home;
}
