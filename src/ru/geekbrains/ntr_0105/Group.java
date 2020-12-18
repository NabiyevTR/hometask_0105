package ru.geekbrains.ntr_0105;

public class Group {
    private Employee[] employeesArray;

    public Group() {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Рассказов Василий Иванович", "Генеральный директор", "vras@mail.ru", "+71234567890", 350000, 45);
        employeesArray[1] = new Employee("Овчинников Александр Владимирович", "Технический директор", "aov@mail.ru", "+79876543210", 250000, 42);
        employeesArray[2] = new Employee("Балцевич Андрей Юрьевич", "Инженер-электрик", "abal@mail.ru", "+79175621245", 70000, 28);
        employeesArray[3] = new Employee("Смольянов Александр Вячеславович", "Главный инженер", "asml@mail.ru", "+78924568563", 150000, 44);
        employeesArray[4] = new Employee("Шкурин Максим Леонидович", "Главный архитектор", "mshk@mail.ru", "+78413579672", 160000, 35);

        for (Employee employee: employeesArray) {
            if (employee.getAge() >= 40) {
                employee.print();
            }
        }
    }
}
