package com.vti.service;

import com.vti.entity.SalaryEmployee;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryEmployeeService implements ISalaryService {

  //    @Autowired
  //    private ISalaryRepository iSalaryRepository;

  @Override
  public SalaryEmployee getAllSalaryEm() {
    SalaryEmployee salaryEmployee1 = new SalaryEmployee();
    salaryEmployee1.setId(1);
    salaryEmployee1.setSalary(1000.5);
    salaryEmployee1.setCompanyName("T1");
    salaryEmployee1.setMonth("2");
    salaryEmployee1.setFoodCost(10.5);
    salaryEmployee1.setTransportCost(11);

    SalaryEmployee salaryEmployee2 = new SalaryEmployee();
    salaryEmployee2.setId(2);
    salaryEmployee2.setSalary(50.5);
    salaryEmployee2.setCompanyName("T1");
    salaryEmployee2.setMonth("2");
    salaryEmployee2.setFoodCost(0.5);
    salaryEmployee2.setTransportCost(2.0);

    List<SalaryEmployee> listData = new ArrayList<>();
    listData.add(salaryEmployee2);
    listData.add(salaryEmployee2);
    listData.add(salaryEmployee1);
    listData.add(salaryEmployee1);
    listData.add(salaryEmployee1);

    var salaryOneMonth =
        listData.stream()
            .filter(item -> item.getMonth().equals("2"))
            .mapToDouble(SalaryEmployee::getSalary)
            .sum();

    var totalFoodCost =
        listData.stream()
            .filter(item -> item.getMonth().equals("2"))
            .mapToDouble(SalaryEmployee::getFoodCost)
            .sum();

    var totalTransportCost =
        listData.stream()
            .filter(item -> item.getMonth().equals("2"))
            .mapToDouble(SalaryEmployee::getTransportCost)
            .sum();

    var total1 = totalFoodCost + totalTransportCost;

    listData.stream()
        .forEach(
            item -> {
              item.setTotalRow(item.getSalary() + item.getTransportCost() + item.getFoodCost());
            });

    return new SalaryEmployee(salaryOneMonth, totalFoodCost, totalTransportCost, total1);
  }
}
