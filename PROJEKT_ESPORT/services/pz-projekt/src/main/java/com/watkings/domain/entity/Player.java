package com.watkings.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "PLAYER")
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private String nationality;

    @Column(name = "TEAM_ID")
    private Long team;

    public Player() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public Long getTeam() {
        return team;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setTeam(Long team) {
        this.team = team;
    }
}
