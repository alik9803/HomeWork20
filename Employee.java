package com.example.hw20;

import java.util.Objects;

public class Employee {
        private String firstName;
        private String lastName;

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Employee employee = (Employee) obj;
            return Objects.equals(firstName, employee.firstName) &&
                    Objects.equals(lastName, employee.lastName);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "Имя='" + firstName + '\'' +
                    ", Фамилия='" + lastName + '\'' +
                    '}';
        }
    }
