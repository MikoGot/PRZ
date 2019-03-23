package com.watkings.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="match_event")
public class MatchEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="EVENT_MINUTE")
	private int eventMinute;

	@Column(name="EVENT_TYPE_ID", nullable=false)
	private int eventTypeId;

	@Column(name="PLAYER_ID", nullable=false)
	private int playerId;

	@Column(name="TEAM_ID")
	private int teamId;

	@Column(name="MATCH_ID", nullable=false)
	private int matchId;

	public MatchEvent() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public int getEventMinute() {
		return eventMinute;
	}

	public int getEventTypeId() {
		return eventTypeId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public int getTeamId() {
		return teamId;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEventMinute(int eventMinute) {
		this.eventMinute = eventMinute;
	}

	public void setEventTypeId(int eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
}
