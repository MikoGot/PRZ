package com.watkings.domain.repository;

import com.watkings.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public List<User> findAll();

    public User findById(int playerId);

//    @Query(value="select NAME from player p where p.TEAM_ID in (?1)",nativeQuery=true)
//    public List<String> getNamesByIds(List<Long> scorersIdList);

}
