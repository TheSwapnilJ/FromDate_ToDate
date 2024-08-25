package com.GetDataByDate.FDateTodate.Service;

import com.GetDataByDate.FDateTodate.Entity.Employee;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface MyService {
    public List<Employee> getDataByDate(Date fdate, Date tdate);

    public Employee saveData(Employee employee);
}
