package com.graphql.graphql.repository;

import com.graphql.graphql.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Graphqlrepository extends JpaRepository<Player, Long> {
}
