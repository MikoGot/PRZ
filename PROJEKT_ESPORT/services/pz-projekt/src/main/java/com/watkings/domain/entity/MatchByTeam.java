package com.watkings.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "match_by_team")
public class MatchByTeam implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MATCH_DATE")
    private Date matchDate;

    @Column(nullable = false, length = 45)
    private String rival;

    @Column(name = "ROUND_NUMBER")
    private int roundNumber;

    @Column(name = "TEAM_ID", nullable = false)
    private Long teamId;

    public MatchByTeam() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public String getRival() {
        return rival;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}