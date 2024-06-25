package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Entities.Groupe;
import com.example.demo.Repositories.GroupeRepository;

@Service
public class GroupeServiceImpl implements GroupeService {

    @Autowired
    private GroupeRepository groupeRepository;

    @Override
    public Groupe SaveGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    @Override
    public Groupe GetGroupeById(long id) {
        return groupeRepository.findById(id).orElse(null);
    }

    @Override
    public Groupe updateGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    @Override
    public void deleteGroupeById(long id) {
        groupeRepository.deleteById(id);
    }

    @Override
    public void deleteAllGroupe() {
        groupeRepository.deleteAll();
    }

    @Override
    public List<Groupe> getAllGroupe() {
        return groupeRepository.findAll();
    }
}