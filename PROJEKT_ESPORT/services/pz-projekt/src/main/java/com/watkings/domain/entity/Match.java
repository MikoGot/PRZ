package com.watkings.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "match")
public class Match implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "PLACE_ID")
    private int place;

    @Column(name = "IS_FINISHED")
    private boolean isFinished;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MATCH_DATE")
    private Date matchDate;

    @Column(name = "ROUND_NUMBER")
    private int roundNumber;

    @Column(name = "LEAGUE_ID")
    private Long league;

    @Column(name = "TEAM_HOME_ID", nullable = false)
    private Long team1;

    @Column(name = "TEAM_AWAY_ID", nullable = false)
    private Long team2;

    public Match() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public int getPlace() {
        return place;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public Long getLeague() {
        return league;
    }

    public Long getTeam1() {
        return team1;
    }

    public Long getTeam2() {
        return team2;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public void setLeague(Long league) {
        this.league = league;
    }

    public void setTeam1(Long team1) {
        this.team1 = team1;
    }

    public void setTeam2(Long team2) {
        this.team2 = team2;
    }
}
