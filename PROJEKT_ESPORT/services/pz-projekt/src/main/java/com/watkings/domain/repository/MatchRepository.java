package com.watkings.domain.repository;

import java.util.List;

import com.watkings.domain.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {

	public List<Match> findAll();

//	@Query(value="select * from match where ID = ?1", nativeQuery=true)
	public Match findById(Long matchId);

//	public List<Match> findByLeagueIdAndIsFinished(Long leagueId,boolean isFinished);	

}