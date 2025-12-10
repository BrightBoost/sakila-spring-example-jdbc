package com.pluralsight.demo.dao;

import com.pluralsight.demo.model.Actor;

import java.util.List;

public interface ActorDao {
    List<Actor> getAllActors();
    List<Actor> getActorsByFirstName(String firstName);
    List<Actor> getActorsByLastName(String firstName);
}
