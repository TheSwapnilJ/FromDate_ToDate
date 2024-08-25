package com.GetDataByDate.FDateTodate.Service;

import com.GetDataByDate.FDateTodate.Entity.Employee;
import com.GetDataByDate.FDateTodate.Repository.myRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class MyServiceIMPL implements MyService{
    @Autowired
    public myRepository myRepo;

    @Override
    public List<Employee> getDataByDate(Date fdate, Date tdate) {
        return myRepo.findByDateBetween(fdate,tdate);
    }

    @Override
    public Employee saveData(Employee employee) {
        return myRepo.save(employee);
    }
}
