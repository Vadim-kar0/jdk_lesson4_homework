package org.example;

public class Main {
    public static void main(String[] args) {
        DictionaryOfEmployee dictionary = new DictionaryOfEmployee();
        dictionary.addNewEmployee(new Employee(1,"+79371111111","Name1",10));
        dictionary.addNewEmployee(new Employee(2,"+79371111112","Name2",11));
        dictionary.addNewEmployee(new Employee(3,"+79371111113","Name3",11));
        dictionary.addNewEmployee(new Employee(4,"+79371111114","Name4",13));
        dictionary.addNewEmployee(new Employee(5,"+79371111115","Name2",14));
        dictionary.addNewEmployee(new Employee(6,"+79371111116","Name6",15));
        dictionary.addNewEmployee(new Employee(7,"+79371111117","Name7",16));
        dictionary.addNewEmployee(new Employee(8,"+79371111118","Name8",17));
        dictionary.addNewEmployee(new Employee(9,"+79371111119","Name9",18));


        //Добавить метод добавления нового сотрудника в справочник
        Employee employee = new Employee(9,"+79371111900","Name900",100);
        dictionary.addNewEmployee(employee);

        System.out.println(dictionary);

        System.out.println("\nДобавить метод, который ищет сотрудника по стажу (может быть список)");
        System.out.println(dictionary.findEmployeeByExperience(11));

        System.out.println("\nДобавить метод, который возвращает номер телефона сотрудника по имени (может быть список)");
        System.out.println(dictionary.findNumberByName("Name2"));

        System.out.println("\nДобавить метод, который ищет сотрудника по табельному номеру");
        System.out.println(dictionary.findEmployeeByID(2));
    }
}
