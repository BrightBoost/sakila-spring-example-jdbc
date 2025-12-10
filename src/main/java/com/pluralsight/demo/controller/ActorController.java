package com.pluralsight.demo.controller;

import com.pluralsight.demo.model.Actor;
import com.pluralsight.demo.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("actors")
public class ActorController {
    private ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<Actor> getAll() {
        return actorService.getActors();
    }

    @GetMapping("first/{firstName}")
    public List<Actor> getActorsByFirstName(@PathVariable String firstName) {
        return actorService.getActorsByFirstName(firstName);
    }

    @GetMapping("last/{lastName}")
    public List<Actor> getActorsByLastName(@PathVariable String lastName) {
        return actorService.getActorsByLastName(lastName);
    }


}
