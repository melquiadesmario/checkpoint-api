package com.bootcamp.dio.checkpoint.controller;

import com.bootcamp.dio.checkpoint.model.WorkingDay;
import com.bootcamp.dio.checkpoint.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journey")
public class WorkingDayController {
    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createJourney(@RequestBody WorkingDay workingDay){
        return workingDayService.saveWorkingDay(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getJourneyList(){
        return workingDayService.finAll();
    }

    @GetMapping("/{idJourney}")
    public ResponseEntity<WorkingDay> getJourneyById(@PathVariable("idJourney") Long idJourney) throws Exception{
        return ResponseEntity.ok(workingDayService.getById(idJourney).orElseThrow(() -> new NoSuchElementException("Journey not found!")));
    }

    @PutMapping
    public WorkingDay updateJourney(@RequestBody WorkingDay workingDay){
        return workingDayService.updateWorkingDay(workingDay);
    }

    @DeleteMapping("/{idJourney}")
    public ResponseEntity deleteById(@PathVariable("idJourney") Long idJourney) throws Exception{
        try{
            workingDayService.deleteWorkingDay(idJourney);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();
    }
}
