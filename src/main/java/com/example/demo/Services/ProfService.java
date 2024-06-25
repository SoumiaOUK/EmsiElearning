package com.example.demo.Services;

import com.example.demo.Entities.Groupe;
import com.example.demo.Entities.Prof;

import java.util.List;

public interface ProfService {
    Prof SaveProf(Prof Prof);
    Prof GetProfById(long id);
    Prof updateProf(Prof Prof);
    void deleteProfById(long id);
    void deleteAllProf();
    List<Prof> getAllProf();
}
