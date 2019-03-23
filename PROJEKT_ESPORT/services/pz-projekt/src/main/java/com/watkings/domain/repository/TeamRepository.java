package com.watkings.domain.repository;

import java.util.List;

import com.watkings.domain.entity.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

	public List<Team> findAll();

	public Team findById(Long Id);

	public List<Team> findByLeagueId(Long leagueId);	

}