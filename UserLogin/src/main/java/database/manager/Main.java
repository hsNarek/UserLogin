package database.manager;

import database.model.User;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();


        User byNameAndPassword = userManager.getByEmailAndPassword("garnik", "gar");
        System.out.println(byNameAndPassword);

    }
}
