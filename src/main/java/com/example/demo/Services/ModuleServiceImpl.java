package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Entities.Module;
import com.example.demo.Repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    @Override
    public Module SaveModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public Module GetModuleById(long id) {
        return moduleRepository.findById(id).orElse(null);
    }

    @Override
    public Module updateModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public void deleteModuleById(long id) {
        moduleRepository.deleteById(id);
    }

    @Override
    public void deleteAllModule() {
        moduleRepository.deleteAll();
    }

    @Override
    public List<Module> getAllModule() {
        return moduleRepository.findAll();
    }
}