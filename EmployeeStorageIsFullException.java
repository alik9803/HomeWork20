package com.example.hw20;

class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException() {
        super("Хранилище для сотрудников заполнено");
    }
}