public class Main {
    public static void main(String[] args) {
//Задание 1.
        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - "+fullName);


        System.out.println("Задание 2");

        String fullNameСapital = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullNameСapital);


        System.out.println("Задание 3");

        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " +fullName2);


    }
}