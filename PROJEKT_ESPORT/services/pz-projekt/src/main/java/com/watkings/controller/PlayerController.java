package com.watkings.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.service.PlayerService;
import com.watkings.dto.PlayerUpdateDto;
import com.watkings.domain.entity.Player;
import com.watkings.domain.repository.PlayerRepository;

@RestController
public class PlayerController {

	@Autowired
	PlayerService playerService;
	@Autowired 
	PlayerRepository playerRepository;
	Log log = LogFactory.getLog(PlayerController.class);

	
	@Transactional
	@RequestMapping(value="/update-player/{playerId}", method = RequestMethod.POST)
	public void updatePlayer(@PathVariable int playerId,@RequestBody PlayerUpdateDto playerUpdateDto){
		//String test = playerUpdateDto.getName() +" " + playerUpdateDto.getPosition() + " " + playerUpdateDto.getTeamId().toString() + " " + playerUpdateDto.getNationality();
		log.info("/update-player/{}");
		Player player = playerRepository.findById(playerId);
		playerService.updatePlayer(player, playerUpdateDto);
	}

	@RequestMapping(value="/add-player", method = RequestMethod.POST)
	public void addPlayer(@RequestBody PlayerUpdateDto playerUpdateDto){
		//String test = playerUpdateDto.getName() +" " + playerUpdateDto.getPosition() + " " + playerUpdateDto.getTeamId().toString() + " " + playerUpdateDto.getNationality();
		log.info("/add-player  {}" );
		Player player = new Player();
		playerService.updatePlayer(player, playerUpdateDto);
	}
	
}
