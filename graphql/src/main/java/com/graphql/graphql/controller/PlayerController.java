package com.graphql.graphql.controller;

import com.graphql.graphql.model.Player;
import com.graphql.graphql.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PlayerController {
    @Autowired
    PlayerService playerService;

   /* public PlayerController(PlayerService playerService)
    {
        this.playerService = playerService;
    }*/
    @QueryMapping
    public List<Player> findAll(){
        List<Player> all = playerService.findAll();
        return all;
    }
    @QueryMapping
    public Optional<Player> findOne(@Argument Long id){
        return playerService.findOne(id);
        
    }
    @MutationMapping
    public Player create(@Argument String name,@Argument String team){
        return playerService.create(name,team);
    }
    @MutationMapping
    public Player update(@Argument Long id, @Argument String name,@Argument String team){
        return playerService.update(id,name,team);
    }
    @MutationMapping
    public Player delete(@Argument Long id){
        return playerService.delete(id);
    }
}
