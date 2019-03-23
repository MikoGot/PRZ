package com.watkings.domain.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the LEAGUE database table.
 */
@Entity
@Table(name = "LEAGUE")
@NamedQuery(name = "League.findAll", query = "SELECT l FROM League l")
public class League implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "LEAGUE_NAME", length = 45)
    private String leagueName;

    public League() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}