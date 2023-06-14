package com.chathuru.accessingdatamysql.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Salaries {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer emp_no;
    private Integer salary;
    private String from_date;
    private String to_date;
}
