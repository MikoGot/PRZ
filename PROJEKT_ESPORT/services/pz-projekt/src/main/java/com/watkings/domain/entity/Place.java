package com.watkings.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "PLACE")
public class Place implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true, nullable = false)
    private int id;

    @Column(length = 45)
    private String address;

    @Column(length = 45)
    private String name;

//    @OneToMany(mappedBy = "PLACE")
//    private List<Match> matches;

    public Place() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

//    public List<Match> getMatches() {
//        return matches;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setMatches(List<Match> matches) {
//        this.matches = matches;
//    }
}
