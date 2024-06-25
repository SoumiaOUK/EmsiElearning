//package com.example.demo.Services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//import com.example.demo.Entities.Prof;
//import com.example.demo.Repositories.ProfRepository;
//
//@Service
//public class ProfServiceImpl implements ProfService {
//
//    @Autowired
//    private ProfRepository profRepository;
//
//    @Override
//    public Prof SaveProf(Prof prof) {
//        return profRepository.save(prof);
//    }
//
//    @Override
//    public Prof GetProfById(long id) {
//        return profRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public Prof updateProf(Prof prof) {
//        return profRepository.save(prof);
//    }
//
//    @Override
//    public void deleteProfById(long id) {
//        profRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllProf() {
//        profRepository.deleteAll();
//    }
//
//    @Override
//    public List<Prof> getAllProf() {
//        return profRepository.findAll();
//    }
//}