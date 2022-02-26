package com.engeto.lekce2;

import java.time.LocalDate;

public class Player {
    String name;
    LocalDate dateOfBirth;
    int number;
    boolean rightFoot;

    public Player (String name, LocalDate dateOfBirth, int number) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    public Player(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.number = 0;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isRightFoot() {
        return rightFoot;
    }

    public void setRightFoot(boolean rightFoot) {
        this.rightFoot = rightFoot;
    }
}


