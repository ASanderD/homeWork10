public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        String firstName = "Ivan"; //строка для хранения имени
        String middleName = "Ivanovich"; //строка для хранения отчества
        String lastName = "Ivanov"; //строка для хранения фамилии
        String fullName = lastName + " " + firstName + " " + middleName; // строка для конкатенации строк
        System.out.println("Ф.И.О. сотрудника - " + fullName); // вывод результата в консоль

        System.out.println("Задание 2");
        String fullNameToUpperCase = fullName.toUpperCase(); //перевод строки в верхний регистр
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameToUpperCase); // вывод результата в консоль

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович"; // присваивание fullName строки по заданию
        String fullNameReplace = fullName.replace("ё", "е"); // метод для замены символов
        System.out.println("Данные ф.И.О. сотрудника - " + fullNameReplace); // вывод результата в консоль
    }
}