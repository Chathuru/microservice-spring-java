package com.chathuru.accessingdatamysql.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer emp_no;
	private String birth_date;
	private String first_name;
	private String last_name;
	private String gender;
	private String hire_date;
}
