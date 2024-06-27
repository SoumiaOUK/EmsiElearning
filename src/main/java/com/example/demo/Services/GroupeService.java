package com.example.demo.Services;

import com.example.demo.Entities.Groupe;

import java.util.List;

public interface GroupeService {
    Groupe SaveGroupe(Groupe groupe);
    Groupe GetGroupeById(long id);
    Groupe updateGroupe(Groupe groupe);
    void deleteGroupeById(long id);
    void deleteAllGroupe();
    List<Groupe> getAllGroupe();
}
