package com.example.demo.Services;

import com.example.demo.Entities.Groupe;
import com.example.demo.Entities.Module;

import java.util.List;

public interface ModuleService {
    Module SaveModule(Module Module);
    Module GetModuleById(long id);
    Module updateModule(Module Module);
    void deleteModuleById(long id);
    void deleteAllModule();
    List<Module> getAllModule();
}
