package com.pluralsight.demo.dao;

import com.pluralsight.demo.model.Actor;

import java.util.List;

public interface ActorDao {
    List<Actor> getAllActors();
    Actor getActorById(int id);
    List<Actor> getActorsByFirstName(String firstName);
    List<Actor> getActorsByLastName(String lastName);

    Actor addNewActor(Actor actor);
    void updateExistingActor(int id, Actor actor);
    void deleteActor(int id);

}
