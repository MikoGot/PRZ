package com.watkings.service;

import java.util.ArrayList;
import java.util.List;

import com.watkings.dto.MatchByTeamDto;
import com.watkings.dto.TeamBasicDto;
import com.watkings.dto.TeamUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.entity.MatchByTeam;
import com.watkings.domain.repository.MatchByTeamRepository;
import com.watkings.domain.repository.MatchRepository;
import com.watkings.domain.repository.PlayerRepository;
import com.watkings.domain.entity.Team;
import com.watkings.domain.repository.TeamRepository;
import com.watkings.utils.ProjectDateFormat;

@Component
public class TeamService {
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	MatchRepository matchRepository;
	@Autowired
	MatchByTeamRepository matchByTeamRepository;
	@Autowired
	ProjectDateFormat dateFormat;
	
	public void updateTeam(Team team, TeamUpdateDto teamUpdateDto) {
		
		if(teamUpdateDto.getFaundationDate()!=null)
			team.setFaundationDate(teamUpdateDto.getFaundationDate(dateFormat.getSimpleDateFormat()));
		if(teamUpdateDto.getName()!=null)
			team.setName(teamUpdateDto.getName());
		if(teamUpdateDto.getCapitainId()!=null)
			team.setCapitainId(teamUpdateDto.getCapitainId());
		if(teamUpdateDto.getLeagueId()!=null)
		team.setLeagueId(teamUpdateDto.getLeagueId());
		
		teamRepository.save(team);

	}
	public List<TeamBasicDto> getTeamsByLeague(int leagueId) {
		List<Team> teamsList = teamRepository.findByLeagueId((long) leagueId);
		List<TeamBasicDto> teamsDtoList  = new ArrayList<TeamBasicDto>();
		
		for(Team team: teamsList){
			teamsDtoList.add(new TeamBasicDto(team.getId(), team.getName()));
		}
		
		return teamsDtoList;
	}
	
	public List<MatchByTeamDto> getTeamsMatchesList(int teamId) {
		List<MatchByTeamDto> matchesDtoList = new ArrayList<MatchByTeamDto>();
		List<MatchByTeam> matchesList = matchByTeamRepository.findByTeamId(new Long(teamId));
		
		if(matchesList.isEmpty())
			return matchesDtoList;
		
		for(MatchByTeam match : matchesList){
			matchesDtoList.add(new MatchByTeamDto(match.getId().toString(),
												 match.getMatchDate().toString(), 
												 match.getRival(),
												 Integer.toString(match.getRoundNumber())));										
		}
		return matchesDtoList;
	}

	
	

}
