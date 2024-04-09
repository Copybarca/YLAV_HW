package org.ylab.access.model;

public class Admin extends Person {
    private int id;
    private String name;
    private final String ROLE = "ADMIN";
    private String username;
    private String password;

    public Admin(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }



    public int getId() {
        return id;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getRole() {
        return ROLE;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}
