package main;

import database.Database;
import student.Student;
import teacher.Teacher;

public class MainClass {

    public static void main(String[] args) {
        Database std = new Student();
        std.createUser();
        std.readUser();
        std.updateUser();
        std.deleteUser();

        Database obj1 = new Teacher();
        obj1.createUser();
        obj1.readUser();
        obj1.updateUser();
        obj1.deleteUser();

    }
}
