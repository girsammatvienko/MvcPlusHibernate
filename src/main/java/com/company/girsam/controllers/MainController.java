package com.company.girsam.controllers;

import com.company.girsam.entity.Employee;
import com.company.girsam.repository.EmployeeDAO;
import com.company.girsam.repository.EmployeeDAOImpl;
import com.company.girsam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/getAllEmployees")
    public String getAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/getAllEmployees";
    }

    @RequestMapping("/editEmployee")
    public String editEmployee(@ModelAttribute("employee") Employee employee) {

        return "redirect:/editEmployee";
    }

    @RequestMapping("/updateInfo")
    public String updateInfo(@RequestParam("empId") int id, Model model) {
        model.addAttribute("employee", employeeService.getEmployee(id));
        return "employee-info";
    }


}
