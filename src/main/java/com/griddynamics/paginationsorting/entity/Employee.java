package com.griddynamics.paginationsorting.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String name;
    private Integer age;
    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber=(long) (Math.random()*Math.pow(10,10));
    private String designation;
    private Double salary = Math.random()*100000;
}
