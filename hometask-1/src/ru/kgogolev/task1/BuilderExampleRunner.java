package ru.kgogolev.task1;

public class BuilderExampleRunner {
    public static void main(String[] args) {
        var person1 = new Person.PersonBuilder().
                build();
        var person2 = new Person.PersonBuilder()
                .age(20)
                .firstName("FirstName")
                .lastName("LastName")
                .build();
        System.out.println(person1);
        System.out.println(person2);
    }
}
