package lesson5;


public class homework5 {
    public static void main(String[] args) {
        int setAge = 40;

        Staff[] person = new Staff[5];
        person[0] = new Staff("Ivanov Ivan", "Director",
                "ivivan@mailbox.com", "+7 (923) 123-12-75", 130000, 49);
        person[1] = new Staff("Petrov Petr", "Deputy Director",
                "petrov@gmail.com", "+7 (928) 123-45-45", 120000, 47);
        person[2] = new Staff("Vasiliev Vasilii", "Architector",
                "vasyalol@yandex.ru", "+7 (925) 987-56-35", 115000, 42);
        person[3] = new Staff("Yuriev Yurii", "Programmer",
                "jurassic@mail.ru", "+7 (918) 107-37-22", 110000, 30);
        person[4] = new Staff("Aleksandrov Aleksandr", "Security",
                "topgun@minbox.ru", "+7 (929) 127-46-06", 35000, 35);

        System.out.printf("List of employees with age more %d %s.\n", setAge, getEmpYears(setAge));
        for (Staff persons : person) {
            if (persons.getAge() > setAge) {
                System.out.println();
                System.out.println(persons.toString());
            }
        }
    }
}

class Staff {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Staff(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    static String getEmpYears(int age) {
        int a1;
        int a2;
        a1 = age % 10;
        a2 = age % 100;

        if (a1 == 1 && a2 != 11) {
            return "year";
        } else if (a1 >= 2 && a1 <= 4 && (a2 < 10 || a2 >= 20)) {
            return "years";
        } else {
            return "year's";
        }
    }

    @Override
    public String toString() {
        return name +
                "\n| Position: " + position +
                "\n| E-mail: " + email +
                "\n| Phone number: " + phone +
                "\n| Salary: " + salary + " russian rubbles" +
                "\n| Age: " + age + " " + getEmpYears(age) + ".";
    }
}