package com.example.jenkins.demo;

import com.example.jenkins.demo.bean.Employee;
import com.example.jenkins.demo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Employee alex = new Employee("alex");
        employeeService.add(alex);

        // when
        List<Employee> employees = employeeService.getEmployees();

        // then
        assertThat(employees.size()).isEqualTo(1);
    }

}
