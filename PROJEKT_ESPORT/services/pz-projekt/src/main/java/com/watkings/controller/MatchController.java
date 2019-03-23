package com.watkings.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.dto.EventDto;
import com.watkings.dto.MatchInfoDto;
import com.watkings.service.MatchService;
import com.watkings.dto.MatchUpdateDto;
import com.watkings.domain.entity.Match;
import com.watkings.domain.repository.MatchRepository;

@RestController
public class MatchController {

	@Autowired
	MatchRepository matchRepository;
	@Autowired
	MatchService matchService;
	
	Log log = LogFactory.getLog(MatchController.class);

	@RequestMapping(value="/update-match/{matchId}", method = RequestMethod.POST)
	public void updateMatch(@PathVariable int matchId,@RequestBody MatchUpdateDto matchUpdateDto){
		log.info("/update-match/{matchId}");
		Match match = matchRepository.findById(new Long(matchId));
		matchService.updateMatch(match, matchUpdateDto);
	}

	@RequestMapping(value="/add-match", method = RequestMethod.POST)
	public void addPlayer(@RequestBody MatchUpdateDto matchUpdateDto){
		log.info("/add-match");
		Match match = new Match();
		matchService.updateMatch(match, matchUpdateDto);
	}

	@RequestMapping(value="/match-info/{matchId}", method = RequestMethod.GET)
	public MatchInfoDto getMatchInfo(@PathVariable int matchId){
		log.info("/match-info/{matchId}");
		Long id = new Long(matchId);
		Match match = matchRepository.findById(id);
		MatchInfoDto matchInfoDto =new MatchInfoDto();
		if(match!=null){
			matchInfoDto = matchService.getMatchInfo(match);
			return matchInfoDto;
		}
		else{
			return matchInfoDto;
		}
	}
	
	@RequestMapping(value="/add-result/{matchId}", method = RequestMethod.POST)
	public void addMatchResult(@PathVariable int matchId, @RequestBody EventDto eventDto){
		log.info("/add-result/{matchId}");
		matchService.addResult(matchId, eventDto);
	}

}
