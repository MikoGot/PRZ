package com.watkings.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the news database table.
 */
@Entity
@Table(name = "news")
public class News implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(length = 45)
    private String title;

    @Column(length = 500)
    private String body;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public News() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}