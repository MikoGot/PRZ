package com.watkings.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "team")
public class Team implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "FAUNDATION_DATE")
    private Date faundationDate;

    @Column(name = "LEAGUE_ID")
    private Long leagueId;

    @Column(nullable = false, length = 45)
    private String name;

    //bi-directional many-to-one association to Player
    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    private List<Player> players;

    @Column(name = "CAPITAIN_ID")
    private Long capitainId;

    public Team() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Date getFaundationDate() {
        return faundationDate;
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Long getCapitainId() {
        return capitainId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFaundationDate(Date faundationDate) {
        this.faundationDate = faundationDate;
    }

    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setCapitainId(Long capitainId) {
        this.capitainId = capitainId;
    }
}
