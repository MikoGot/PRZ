package com.watkings.service;

import com.watkings.dto.PlayerUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.entity.Player;
import com.watkings.domain.repository.PlayerRepository;

@Component
public class PlayerService {
	
	@Autowired 
	PlayerRepository playerRepository;
	

	public void updatePlayer(Player player, PlayerUpdateDto playerUpdateDto) {
		
//		Long testTeamId = new Long(playerUpdateDto.getTeamId());
		
		if(playerUpdateDto.getName()!=null && !playerUpdateDto.getName().contains("undefined"))
			player.setName(playerUpdateDto.getName());
		if(playerUpdateDto.getNationality()!=null)
			player.setNationality(playerUpdateDto.getNationality());
		if(playerUpdateDto.getTeamId()!=null)
			player.setTeam(playerUpdateDto.getTeamId());
		
		playerRepository.save(player);
	}


}
