package org.ylab.model;

import java.util.Date;

public class Train {
    private int id;
    private String type;
    private double calories;
    private Date date;
    private int repetitions;


    public Train() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Train(int id, String type, double calories) {
        this.id = id;
        this.type = type;
        this.calories = calories;
    }

    public int getRepetitions() {
        return repetitions;
    }
    public String getType() {
        return type;
    }
    public double getCalories() {
        return calories;
    }
    public Date getDate() {
        return date;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
}
