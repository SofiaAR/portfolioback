package com.sofia.portfolio.repository;

import com.sofia.portfolio.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
