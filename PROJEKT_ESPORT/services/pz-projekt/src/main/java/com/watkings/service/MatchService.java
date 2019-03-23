package com.watkings.service;

import java.util.List;

import com.watkings.dto.EventDto;
import com.watkings.dto.MatchInfoDto;
import com.watkings.dto.MatchUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.entity.Place;
import com.watkings.domain.repository.PlaceRepository;
import com.watkings.domain.entity.Match;
import com.watkings.domain.entity.MatchEvent;
import com.watkings.domain.repository.MatchEventRepository;
import com.watkings.domain.repository.MatchRepository;
import com.watkings.domain.repository.PlayerRepository;
import com.watkings.domain.entity.Results;
import com.watkings.domain.repository.ResultsRepository;
import com.watkings.domain.repository.TeamRepository;
import com.watkings.utils.ProjectDateFormat;

@Component
public class MatchService {
	
	@Autowired
	MatchRepository matchRepository;	
	@Autowired
	PlaceRepository placeRepository;
	@Autowired
	TeamRepository teamRepository;	
	@Autowired
	ProjectDateFormat dateFormat;	
	@Autowired 
	ResultsRepository resultsRepository;	
	@Autowired
	MatchEventRepository matchEventRepository;
	@Autowired
	PlayerRepository playerRepository;

	public void updateMatch(Match match, MatchUpdateDto matchUpdateDto) {
		match.setPlace(placeRepository.getRandomPlace());
		match.setFinished(false);
		if(matchUpdateDto.getMatchDate()!=null)
			match.setMatchDate(matchUpdateDto.getMatchDate(dateFormat.getSimpleDateFormat()));
		if(matchUpdateDto.getTeam1Id()!=null)
			match.setTeam1(matchUpdateDto.getTeam1Id());
		if(matchUpdateDto.getTeam2Id()!=null)
			match.setTeam2(matchUpdateDto.getTeam2Id());
		
		matchRepository.save(match);
	}

	public MatchInfoDto getMatchInfo(Match match) {
	
		Results result = resultsRepository.findByMatchId(match.getId().intValue());
		List<String> scorersList = getMatchScorersList(match);
		Place place =  placeRepository.findById(match.getPlace());
		
		MatchInfoDto matchInfoDto = toDto(result, scorersList, match, place);
		
	return matchInfoDto;
	}

	private MatchInfoDto toDto(Results result, List<String> scorersList, Match match, Place place) {
		MatchInfoDto matchInfoDto = new MatchInfoDto();
		
		if(place !=null){
			matchInfoDto.setPlaceAddress(place.getAddress());
			matchInfoDto.setPlaceName(place.getName());
		}
		if(result!=null){
			matchInfoDto.setMatchweekNumber(result.getMatchweekNumber());
			matchInfoDto.setTeam1Name(result.getTeamHomeName());
			matchInfoDto.setTeam2Name(result.getTeamAwayName());
			matchInfoDto.setTeam1Result(result.getGoalsHome().toString());
			matchInfoDto.setTeam2Result(result.getGoalsAway().toString());
		}
		if(scorersList!=null)
			matchInfoDto.setScorersList(scorersList);
		if(match.getMatchDate()!=null)
		matchInfoDto.setMatchDate(match.getMatchDate().toString());
		
		return matchInfoDto;
	}

	private List<String> getMatchScorersList(Match match) {
		List<Long> scorersIdList = matchEventRepository.findMatchScorers(match.getId().intValue());
		List<String> scorersNamesList = playerRepository.getNamesByIds(scorersIdList);
		return scorersNamesList;
	}

	public void addResult(int matchId, EventDto eventDto) {
		MatchEvent matchEvent = new MatchEvent();
		
		matchEvent.setMatchId(matchId);
		if(eventDto.getEventTypeId()!=null)
			matchEvent.setEventTypeId(Integer.parseInt(eventDto.getEventTypeId()));
		if(eventDto.getPlayerId()!=null)
			matchEvent.setPlayerId(Integer.parseInt(eventDto.getPlayerId()));
		if(eventDto.getTeamId()!=null)
			matchEvent.setTeamId(Integer.parseInt(eventDto.getTeamId()));
		if(eventDto.getEventMinute()!=null)
			matchEvent.setEventMinute(Integer.parseInt(eventDto.getEventMinute()));
		
		matchEventRepository.save(matchEvent);
		
	}
}
