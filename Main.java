
public class Main {

    public static void main(String args[]) {

        /* запуск 1 задания */
        Employee employee = new Employee("Нуриев", "Алмаз", "Илфирович", "Инженер", "nurievam91@gmail.com", "+79083385311",29999,29);
        employee.displayInfo();


        /* запуск 2 задания */
        Employee2[] employeeArray = new Employee2[5];
        employeeArray[0] = new Employee2("Семин", "Александр", "Иванович", "инженер", "11@mail.ru","899999999", 30000,120);
        employeeArray[1] = new Employee2("Новиков", "Константин", "Федорович", "маляр", "kovach@mail.ru", "123213123", 100000,25);
        employeeArray[2] = new Employee2("Покровский", "Матвей", "Янович", "Директор директоров", "1stman@mail.ru", "11111113", 15, 26);
        employeeArray[3] = new Employee2("Нуриев", "Алмаз", "Илфирович", "Начинающий Тестеровщик", "mymail@gmail.com", "133451241", 5000,132);
        employeeArray[4] = new Employee2("Пономарев", "Иван", "Максимович", "Проверяющий ДЗ", "maybe@mail.ru", "987223414", 991,111);

        for (Employee2 employee2 : employeeArray) {
            employee2.displayInfo2();

        /*запуск 3 задания */
        }
        Park park = new Park();
        park.showAttractions();
    }
}
