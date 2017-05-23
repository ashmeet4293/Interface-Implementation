
package teacher;

import database.Database;

public class Teacher implements Database{
    public void createUser() {
        System.out.println("Teacher Created in database ");
    }

    public void readUser() {
        System.out.println("TEacher data Fetched ");

    }

    public void updateUser() {
        System.out.println("Teacher Data Updated");

    }

    public void deleteUser() {
        System.out.println("Teacher Data Deleted ");

    }
    
}
