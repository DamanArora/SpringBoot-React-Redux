package com.example.projectBoard.repository;

import com.example.projectBoard.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepositoy extends CrudRepository<ProjectTask, Long> {

    ProjectTask getById(Long id);
}
