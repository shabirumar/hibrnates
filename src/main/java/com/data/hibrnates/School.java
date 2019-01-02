package com.data.hibrnates;

import javax.persistence.*;

@Entity
@Table(name="school")
public class School
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public School(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
