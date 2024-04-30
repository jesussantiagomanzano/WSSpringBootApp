package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Tag;
import com.myapp.unsij.service.TagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "tag")
public class TagController {

    private final TagService tagService;


    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @PostMapping
    public List<Tag> saveTags(@RequestBody Set<Tag> tags){
        return tagService.saveTags(tags);
    }

    @GetMapping
    public List<Tag> findAll(){
        return tagService.findAll();
    }

}
