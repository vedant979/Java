package com.rwi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class students {
    @Id
    @Column(name="stud_id")
    private int id;

    @Column(name="student_id")
    private student_name name;

    @Column(name="student_marks")
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public student_name getName() {
        return name;
    }

    public void setName(student_name name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "students{" +
                "id=" + id +
                ", name=" + name.toString() +
                ", marks=" + marks +
                '}';
    }
}
