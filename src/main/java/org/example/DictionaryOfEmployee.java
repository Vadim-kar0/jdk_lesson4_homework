package org.example;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DictionaryOfEmployee {
    private List<Employee> employees;

    public DictionaryOfEmployee() {
        this.employees = new ArrayList<>();
    }

    public DictionaryOfEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> findEmployeeByExperience(int experience){
        //List<Employee> result = new ArrayList<>();
        //for (Employee employee : employees) {
        //    if(employee.experience() == experience){
        //        result.add(employee);
        //    }
        //}
        //return result;
        return employees.stream().filter(s -> s.experience() == experience).collect(Collectors.toList());
    }
    public List<String> findNumberByName(String name){
        //List<String> result = new ArrayList<>();
        //for (Employee employee : employees) {
        //    if(employee.name().equals(name)){
        //        result.add(employee.phoneNumber());
        //    }
        //}
        //return result;
        return employees.stream().filter(s -> s.name().equals(name))
                .map(Employee::phoneNumber).collect(Collectors.toList());
    }
    public Employee findEmployeeByID(int id){
        //for (Employee employee : employees) {
        //    if(employee.id() == id){
        //        return employee;
        //    }
        //}
        //return null;
        return employees.stream().filter(s -> s.id() == id).findAny().orElse(null);
    }
    public void addNewEmployee(Employee employee){
        employees.add(employee);
    }
    public void addNewEmployee(int id,String phoneNumber,String name,int experience){
        employees.add(new Employee(id,phoneNumber,name,experience));
    }








    @Override
    public String toString() {
        return "DictionaryOfEmployee{" +
                "employees=\n" + employees.toString().replaceAll("],","],\n") +
                '}';
    }
}
