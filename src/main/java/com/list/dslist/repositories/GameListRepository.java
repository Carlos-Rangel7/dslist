package com.list.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.list.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
