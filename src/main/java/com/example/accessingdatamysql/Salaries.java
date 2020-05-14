package com.example.accessingdatamysql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Salaries {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer emp_no;
    private Integer salary;
    private String from_date;
    private String to_date;
}
