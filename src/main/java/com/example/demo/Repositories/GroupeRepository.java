package com.example.demo.Repositories;

import com.example.demo.Entities.Course;
import com.example.demo.Entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
}
