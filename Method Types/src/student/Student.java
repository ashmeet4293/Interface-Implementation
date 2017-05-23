package student;

import database.Database;

public class Student implements Database {

    public void createUser() {
        System.out.println("Student Created in database ");
    }

    public void readUser() {
        System.out.println("Student data Fetched ");

    }

    public void updateUser() {
        System.out.println("Student Data Updated");

    }

    public void deleteUser() {
        System.out.println("Student Data Deleted ");

    }
}
