package com.bootcamp.dio.checkpoint.service;

import com.bootcamp.dio.checkpoint.model.WorkingDay;
import com.bootcamp.dio.checkpoint.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {
    WorkingDayRepository workingDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workingDayRepository){
        this.workingDayRepository = workingDayRepository;
    }

    public WorkingDay saveWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public List<WorkingDay> finAll() {
        return workingDayRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long idJourney) {
        return workingDayRepository.findById(idJourney);
    }

    public WorkingDay updateWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public void deleteWorkingDay(Long idJourney) {
        workingDayRepository.deleteById(idJourney);
    }
}
