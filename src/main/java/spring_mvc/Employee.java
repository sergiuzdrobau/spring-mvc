package spring_mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 3, max = 20, message = "First Name should be between 3 and 20 characters.")
    private String name;

    @NotBlank(message = "Required Field")
    private String surname;

    @Min(value = 1200, message = "Salary at least 1200")
    @Max(value = 3000, message = "Salary under 3001")
    private int salary;

    private String department;
    private Map<String, String> departments;

    private String car;
    private Map<String, String> cars;

    private String[] languages;
    private Map<String, String> languageList;

    @Pattern(regexp = "\\d{3}-\\d{4}-\\d{4}", message = "The phone number should be in this format: XXX-XXXX-XXXX")
    private String phoneNumber;



    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        cars = new HashMap<>();
        cars.put("Mercedes", "MB");
        cars.put("BMW", "BMW");
        cars.put("Audi", "Audi");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Romanian", "Ro");
        languageList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
