package com.example.demo.Services;

import com.example.demo.Entities.Groupe;

import java.util.List;

public interface ProfService {
    Module SaveModule(Module Module);
    Module GetModuleById(long id);
    Module updateModule(Groupe groupe);
    void deleteModuleById(long id);
    void deleteAllModule();
    List<Module> getAllModule();
}
