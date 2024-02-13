package com.graphql.graphql.model;

import com.graphql.graphql.service.PlayerService;
import org.hibernate.annotations.Comment;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutationresolver implements GraphQLMutationResolver{
    @Autowired
   PlayerService playerService;
//    private PlayerService playerService = new PlayerService();
//    @Autowired
//    public Mutationresolver(PlayerService playerService){
//        this.playerService=playerService;

 public Player create(String name, String team){
        return playerService.create(name,team);
 }

}

