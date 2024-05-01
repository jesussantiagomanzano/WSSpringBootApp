package com.myapp.unsij.repository;

import com.myapp.unsij.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

    //SELECT * FOM TAG WHERE NAME=name
    public Tag findByName(String name);


}
