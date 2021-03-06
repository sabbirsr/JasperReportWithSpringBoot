package com.example.JasperReportWithSpringBoot.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private String name;
    @Email
    @Column(unique = true)
    @NotEmpty
    private String email;
    @NotEmpty
    private int batch;
    @NotEmpty
    private Date date;

    public Student() {
    }

    public Student(String name, String email, int batch, Date date) {
        this.name = name;
        this.email = email;
        this.batch = batch;
        this.date = date;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", batch=" + batch +
                ", date=" + date +
                '}';
    }
}
