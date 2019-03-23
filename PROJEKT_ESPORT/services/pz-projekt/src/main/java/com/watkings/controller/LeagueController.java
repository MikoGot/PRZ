package com.watkings.controller;



import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.watkings.domain.entity.Results;
import com.watkings.domain.repository.ResultsRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LeagueController {

	
	@Autowired
	ResultsRepository resultsRepo;
	
	Log log = LogFactory.getLog(LeagueController.class);

	
	@RequestMapping(value="results/last-matchweek/{leagueId}")
	public List<Results> lastMatchweekResults(@PathVariable int leagueId){
		log.info("/results/last-matchweek  " + leagueId);
		return resultsRepo.getLastMatchweekResults();
	}
}
