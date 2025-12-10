package com.pluralsight.demo.controller;

import com.pluralsight.demo.dao.ActorDao;
import com.pluralsight.demo.model.Actor;
import com.pluralsight.demo.service.ActorService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Actor addNewActor(@RequestBody Actor actor) {
        return actorService.addNewActor(actor);
    }

    @PutMapping("{id}")
    public void updateActor(@PathVariable int id, @RequestBody Actor actor) {
        actorService.updateActor(id, actor);
    }

    @DeleteMapping("{id}")
    public void deleteActor(@PathVariable int id) {
        actorService.deleteActor(id);
    }
}
