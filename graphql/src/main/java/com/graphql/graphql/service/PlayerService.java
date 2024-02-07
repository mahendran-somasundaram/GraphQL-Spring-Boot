package com.graphql.graphql.service;

import com.graphql.graphql.model.Player;
import com.graphql.graphql.model.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PlayerService {
    private List<Player> players = new ArrayList<>();

    AtomicInteger id = new AtomicInteger(0);

    public List<Player> findAll() {
        return players;
    }
    public Optional<Player> findOne(Integer id){
        return players.stream().filter(player -> player.getId()==id).findFirst();
    }
    public  Player create(String name, Team team){
        Player player = new Player(id.incrementAndGet(),name,team);
        players.add(player);
        return player;
    }
    public Player delete(Integer id){
        Player player = players.stream().filter(c-> c.getId()==id)
                .findFirst().orElseThrow(()-> new IllegalArgumentException());
        players.remove(player);
        return player;
    }

    public Player update(int id, String name, Team team){
        Player updatedplayer = new Player(id,name,team);
        Optional<Player> optionalPlayer= players.stream().filter(c-> c.getId()==id).findFirst();
        if (optionalPlayer.isPresent()){
            Player player = optionalPlayer.get();
            int index = players.indexOf(player);
            players.set(index,updatedplayer);
        }else {
            throw new IllegalArgumentException();
        }
        return updatedplayer;
    }
    @PostConstruct
    public void init(){
        players.add(new Player(id.incrementAndGet(),"Mahendran",Team.CSk));
        players.add(new Player(id.incrementAndGet(),"Vishwajith",Team.MI));
        players.add(new Player(id.incrementAndGet(),"Timmy",Team.DC));
        players.add((new Player(id.incrementAndGet(),"Pranesh",Team.GT)));
    }

}
