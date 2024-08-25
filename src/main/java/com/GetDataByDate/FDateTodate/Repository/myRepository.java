package com.GetDataByDate.FDateTodate.Repository;
import com.GetDataByDate.FDateTodate.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface myRepository  extends JpaRepository<Employee, Long> {
    List<Employee> findByDateBetween(Date fdate, Date tdate);
}
