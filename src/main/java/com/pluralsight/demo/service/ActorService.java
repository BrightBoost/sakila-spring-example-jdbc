package com.pluralsight.demo.service;

import com.pluralsight.demo.dao.ActorDao;
import com.pluralsight.demo.dao.ActorDaoImpl;
import com.pluralsight.demo.model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    private ActorDao actorDao;

    public ActorService(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    public List<Actor> getActors() {
        return actorDao.getAllActors();
    }

    public List<Actor> getActorsByFirstName(String firstName) {
        return actorDao.getActorsByFirstName(firstName);
    }

    public List<Actor> getActorsByLastName(String lastName) {
        return actorDao.getActorsByLastName(lastName);
    }
}
