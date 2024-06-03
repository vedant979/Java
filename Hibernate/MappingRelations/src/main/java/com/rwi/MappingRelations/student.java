package com.rwi.MappingRelations;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="Student")
public class student {
    @Id
    private int id;
    private String name;
    @OneToMany
    private ArrayList<laptop> laptop = new ArrayList<>();

    public ArrayList<laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(ArrayList<laptop> laptop) {
        this.laptop = laptop;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
