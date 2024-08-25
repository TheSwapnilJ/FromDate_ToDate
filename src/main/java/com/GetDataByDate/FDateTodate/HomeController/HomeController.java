package com.GetDataByDate.FDateTodate.HomeController;

import com.GetDataByDate.FDateTodate.Entity.Employee;
import com.GetDataByDate.FDateTodate.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    public MyService myService;

    @GetMapping("/")
    public List<Employee> getDataByDate(@RequestParam Date fdate,
                                        @RequestParam Date tdate)
    {
        return myService.getDataByDate(fdate,tdate);
    }

    @PostMapping("/")
    public Employee saveData(@RequestBody Employee employee)
    {
        return myService.saveData(employee);
    }
}
