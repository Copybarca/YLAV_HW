package org.ylab.access.dao;

import org.ylab.access.model.Admin;
import org.ylab.access.model.Person;
import org.ylab.access.model.User;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    List<Person> personList;

    public PersonDAO() {
        System.out.println("Конструктор работает");
        List<Person> list =new ArrayList<>();
        Admin admin = new Admin(1,"Sasha","admin", "admin");
        User user = new User(1,"Leksa","user","user");
        list.add(admin);
        list.add(user);
        System.out.println(list.get(0).toString());
        this.personList = list;
    }
    public List<Person> getList(){
        return this.personList;
    }

}
