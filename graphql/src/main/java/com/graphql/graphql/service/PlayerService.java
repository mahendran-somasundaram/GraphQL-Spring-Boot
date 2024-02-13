package com.graphql.graphql.service;

import com.graphql.graphql.model.Player;
import com.graphql.graphql.repository.Graphqlrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private Graphqlrepository graphqlrepository;
//    AtomicInteger id = new AtomicInteger(0);


    public List<Player> findAll() {
        return graphqlrepository.findAll();
    }
    public Optional<Player> findOne(Long id){
        Optional<Player> optionalPlayer = graphqlrepository.findById(id);
        if(optionalPlayer.isPresent()){
            return optionalPlayer;
        }
        else {
            throw new IllegalArgumentException("Player with ID \" + id + \" not found.");
        }
//        return players.stream().filter(player -> player.getId()==id).findFirst();
    }
    public  Player create(String name, String team){
       Player player = new Player();
        player.setName(name);
        player.setTeam(team);
        return graphqlrepository.save(player);
    }
    public Player delete(Long id){
        Optional<Player> optionalPlayer = graphqlrepository.findById(id);
        if (optionalPlayer.isPresent()){
            Player player = optionalPlayer.get();
            graphqlrepository.delete(player);
            return player;
        }else {
            throw new IllegalArgumentException("Player with ID \" + id + \" not found.");
        }

    }

    public Player update(Long id, String name, String team){

        Optional<Player> optionalPlayer= graphqlrepository.findById(id);
        if (optionalPlayer.isPresent()){
            Player player = optionalPlayer.get();
            player.setName(name);
            player.setTeam(team);
            return graphqlrepository.save(player);
        }
        else {
            throw new IllegalArgumentException();
        }

    }
/*    @PostConstruct
    public void init(){
        players.add(new Player(id.incrementAndGet(),"Mahendran",Team.CSk));
        players.add(new Player(id.incrementAndGet(),"Vishwajith",Team.MI));
        players.add(new Player(id.incrementAndGet(),"Timmy",Team.DC));
        players.add((new Player(id.incrementAndGet(),"Pranesh", Team.GT)));
    }*/

}
