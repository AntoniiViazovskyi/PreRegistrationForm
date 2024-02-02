package com.antoniiviazovskyi.spring.preregistration;

import javax.validation.GroupSequence;
import javax.validation.constraints.*;


public class UserData  {
    @Size(min = 2,max = 20, message = " Name length must be between 2 and 20 symbols")
    @Pattern(regexp = "[A-Z][a-z]*", message = "First symbol must be capital")
    private String name;

    @Size(min = 2,max = 20, message = "Surname length must be between 2 and 20 symbols")
    private String surname;

    @NotEmpty(message = "This field can't be empty")
    @Pattern(regexp = "[^!@#$%^&*()_]*",message = "Password can't contain those symbols: !@#$%^&*()")
    private String password;

    @Min(value = 1, message = "Salary must be greater than 0")
    @Max(value = 1_000_000_000, message = "Salary must be less than 1.000.000.001")
    private int salary;

    @NotEmpty(message = "Field email cant be empty")
    @Email(message = "Invalid email address")
    private String email;

    @NotEmpty(message = "Field Phone Number cant be empty")
    @Pattern(regexp = "\\+\\((\\d{2,4})\\)\\d+",message = "Please, use pattern +(Country code)Phone_Number")
    private String phoneNumber;

    public UserData() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}


