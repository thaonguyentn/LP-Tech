package com.vti.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SalaryEmployee")
public class SalaryEmployee implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "DepartmentID")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "salary")
  private double salary;

  @Column(name = "companyName")
  private String companyName;

  @Column(name = "month")
  private String month;

  @Column(name = "foodCost")
  private double foodCost;

  @Column(name = "transportCost")
  private double transportCost;

  @Column(name = "salaryOneMonth")
  private String salaryOneMonth;

  @Column(name = "totalFoodCost")
  private double totalFoodCost;

  @Column(name = "totalTransportCost")
  private double totalTransportCost;

  @Column(name = "totalRow")
  private double totalRow;

  public SalaryEmployee(
      int id,
      double salary,
      String companyName,
      String month,
      double foodCost,
      double transportCost) {
    this.id = id;
    this.salary = salary;
    this.companyName = companyName;
    this.month = month;
    this.foodCost = foodCost;
    this.transportCost = transportCost;
  }

  public SalaryEmployee(
      double salaryOneMonth, double totalFoodCost, double totalTransportCost, double total1) {}
}
