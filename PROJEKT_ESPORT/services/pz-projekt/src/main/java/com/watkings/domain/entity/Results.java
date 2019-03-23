package com.watkings.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the results database table.
 */
@Entity
@Table(name = "results")
public class Results implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MATCH_ID", nullable = false)
    private int matchId;

    @Column(name = "LEAGUE_ID")
    private int leagueId;

    @Column(name = "GOALS_AWAY", precision = 10)
    private BigDecimal goalsAway;

    @Column(name = "GOALS_HOME", precision = 10)
    private BigDecimal goalsHome;

    @Column(name = "MATCHWEEK_NUMBER", nullable = true)
    private int matchweekNumber;

    @Column(name = "TEAM_AWAY_ID")
    private int teamAwayId;

    @Column(name = "TEAM_AWAY_NAME", nullable = false, length = 45)
    private String teamAwayName;

    @Column(name = "TEAM_HOME_ID")
    private int teamHomeId;

    @Column(name = "TEAM_HOME_NAME", nullable = false, length = 45)
    private String teamHomeName;

    public Results() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getMatchId() {
        return matchId;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public BigDecimal getGoalsAway() {
        return goalsAway;
    }

    public BigDecimal getGoalsHome() {
        return goalsHome;
    }

    public int getMatchweekNumber() {
        return matchweekNumber;
    }

    public int getTeamAwayId() {
        return teamAwayId;
    }

    public String getTeamAwayName() {
        return teamAwayName;
    }

    public int getTeamHomeId() {
        return teamHomeId;
    }

    public String getTeamHomeName() {
        return teamHomeName;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public void setGoalsAway(BigDecimal goalsAway) {
        this.goalsAway = goalsAway;
    }

    public void setGoalsHome(BigDecimal goalsHome) {
        this.goalsHome = goalsHome;
    }

    public void setMatchweekNumber(int matchweekNumber) {
        this.matchweekNumber = matchweekNumber;
    }

    public void setTeamAwayId(int teamAwayId) {
        this.teamAwayId = teamAwayId;
    }

    public void setTeamAwayName(String teamAwayName) {
        this.teamAwayName = teamAwayName;
    }

    public void setTeamHomeId(int teamHomeId) {
        this.teamHomeId = teamHomeId;
    }

    public void setTeamHomeName(String teamHomeName) {
        this.teamHomeName = teamHomeName;
    }
}