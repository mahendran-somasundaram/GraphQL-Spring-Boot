package com.graphql.graphql.model;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.SingularAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "graph_table")
public class Player {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long Id;
   String name;
   String Team;

//   public Player(SingularAttribute<AbstractPersistable, Serializable> id, String name, Team team) {
//   }

//   public Player(String name, Team team) {
//   }
}
/*
public enum Team{
   CSk,
   MI,
   DC,
   GT
*/
