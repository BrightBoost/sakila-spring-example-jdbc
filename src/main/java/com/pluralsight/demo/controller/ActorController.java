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

    @GetMapping("{id}")
    public Actor getById(@PathVariable int id) {
        return actorService.getActorById(id);
    }

//    GET /actors/search/by-lastname?lastName=CRU
    @GetMapping("search/by-lastname")
    public List<Actor> getActorByLastName(@RequestParam(required = false) String lastName) {
        return actorService.getActorsByLastName(lastName);
    }

    @GetMapping("search/by-firstname")
    public List<Actor> getActorByFirstName(@RequestParam(required = false) String firstName) {
        return actorService.getActorsByFirstName(firstName);
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
