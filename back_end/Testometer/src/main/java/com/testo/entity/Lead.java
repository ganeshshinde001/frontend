package com.testo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name = "lead_table")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String fname;
	
	private String lname;
	
	private String c_number;
	
	private String email;
	
	private String c_name;
	
	private String interest;
	
	private String lead_type;
	
	private String booking_type;
	
	private String country;
	
	
	
	private String lead_source;
	
	private String created_by;
	
	
	private Date create_date;
	
	private String comment;
	

}
