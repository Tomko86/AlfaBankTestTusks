package org.example.singletone;

public class Admin {

    private static Admin admin;

    private Admin() {

    }
    public static Admin creatAdmin() {
        if (admin == null) {
            System.out.println("Создание админа");
            admin = new Admin();
        }
        return admin;
    }
}
