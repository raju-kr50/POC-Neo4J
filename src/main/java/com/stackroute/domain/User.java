package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

@GraphId
    private Long id;
    private String name;
    private int age;

    @Relationship(type = "RATED", direction = Relationship.INCOMING)
    private List<Movie> movies;

//    public List<Movie> getMovies() {
//        return movies;
//    }

}
