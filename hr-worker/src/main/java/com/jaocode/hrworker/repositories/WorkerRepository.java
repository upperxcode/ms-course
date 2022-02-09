package com.jaocode.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaocode.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
