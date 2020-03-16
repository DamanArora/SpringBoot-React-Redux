package com.example.projectBoard.web;

import com.example.projectBoard.domain.ProjectTask;
import com.example.projectBoard.service.ProjectTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/board")
@CrossOrigin
public class ProjectTaskController {

    @Autowired
    private ProjectTaskService projectTaskService;

    @GetMapping("/all")
    public Iterable<ProjectTask> getAllPt(){
        return projectTaskService.findAll();
    }

    @GetMapping("/{pt_id}")
    public ResponseEntity<?> getPtById(@PathVariable Long pt_id){
        ProjectTask projectTask = projectTaskService.findById(pt_id);
        return new ResponseEntity<ProjectTask>(projectTask, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> addProjectTaskToBoard(@Valid @RequestBody ProjectTask projectTask, BindingResult result){
        if(result.hasErrors()){
            Map<String, String> mapOfError = new HashMap<>();
            for (FieldError fieldError : result.getFieldErrors()){
                mapOfError.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return  new ResponseEntity<Map<String, String>>(mapOfError, HttpStatus.BAD_REQUEST);
        }
        ProjectTask newPt = projectTaskService.saveOrUpdateProjectTask(projectTask);
        return new ResponseEntity<ProjectTask>(newPt, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteId={id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        projectTaskService.deleteById(id);
        return new ResponseEntity<String>("Project Task deleted", HttpStatus.OK);
    }

}
