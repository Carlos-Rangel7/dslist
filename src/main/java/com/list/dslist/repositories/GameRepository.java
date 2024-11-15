package com.list.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.list.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}