package com.example.projectBoard.service;

import com.example.projectBoard.domain.ProjectTask;
import com.example.projectBoard.repository.ProjectTaskRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {
    @Autowired
    private ProjectTaskRepositoy projectTaskRepositoy;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask){
        if(projectTask.getStatus() == null || projectTask.getStatus() == ""){
            projectTask.setStatus("TO_DO");
        }
        return projectTaskRepositoy.save(projectTask);
    }

    public Iterable<ProjectTask> findAll(){
        return projectTaskRepositoy.findAll();
    }

    public ProjectTask findById(Long id){
        return projectTaskRepositoy.getById(id);
    }

    public void deleteById(Long id){
        projectTaskRepositoy.deleteById(id);
    }
}
