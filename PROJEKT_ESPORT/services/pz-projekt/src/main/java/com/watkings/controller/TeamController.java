package com.watkings.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.watkings.dto.MatchByTeamDto;
import com.watkings.dto.TeamBasicDto;
import com.watkings.service.TeamService;
import com.watkings.dto.TeamUpdateDto;
import com.watkings.domain.entity.Player;
import com.watkings.domain.repository.PlayerRepository;
import com.watkings.domain.entity.Team;
import com.watkings.domain.repository.TeamRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TeamController {

	@Autowired
	TeamService service;
	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	TeamService teamService;
	Log log = LogFactory.getLog(TeamController.class);

	@RequestMapping(value="/players/list/{id}", method = RequestMethod.GET)
	public List<Player> getTeamPlayers(@PathVariable int id) {
		log.info("/players/list/{id}");
		List<Player> result = playerRepository.getTemSquad(id);
		return result;
	}

	@Transactional
	@RequestMapping(value="/update-team/{teamId}", method = RequestMethod.POST)
	public void updatePlayer(@PathVariable int teamId,@RequestBody TeamUpdateDto teamUpdateDto){
		log.info("update-team  "+ teamUpdateDto);
		Team team = teamRepository.findById(new Long(teamId));
		teamService.updateTeam(team, teamUpdateDto);
	}

	@RequestMapping(value="/add-team", method = RequestMethod.POST)
	public void addPlayer(@RequestBody TeamUpdateDto teamUpdateDto){
		log.info("add-team   "+ teamUpdateDto);
		Team team = new Team();
		teamService.updateTeam(team, teamUpdateDto);
	}
	
	@RequestMapping(value="/team-info/{teamId}", method = RequestMethod.GET)
	public Team teamInfo(@PathVariable Long teamId){
		log.info("info-team"+ teamId);
		Team result = teamRepository.findById(teamId); 
		return result;
	}
	
	@RequestMapping(value="/teams/list/{leagueId}", method = RequestMethod.GET)
	public List<TeamBasicDto> getAllTeams(@PathVariable int leagueId) {
		log.info("/teams/list");
		return teamService.getTeamsByLeague(leagueId);
	}
	
	@RequestMapping(value="teams/matches/{teamId}", method = RequestMethod.GET)
	//lista meczów danej drużyny
	public List<MatchByTeamDto> getTeamsMatches(@PathVariable int teamId){
		return teamService.getTeamsMatchesList(teamId);
	}

}
