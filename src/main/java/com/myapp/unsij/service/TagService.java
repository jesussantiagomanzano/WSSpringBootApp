package com.myapp.unsij.service;

import com.myapp.unsij.entity.Tag;
import com.myapp.unsij.repository.TagRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TagService {

    private final TagRepository repository;


    public TagService(TagRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public List<Tag> saveTags(Set<Tag> tags){
        return repository.saveAll(tags);
    }

    public List<Tag> findAll() {
        return repository.findAll();
    }
}
