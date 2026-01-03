package com.example.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobportal.model.Job;
import com.example.jobportal.service.JobService;

@RestController
@RequestMapping("/api")
public class JobController {
	@Autowired
	private JobService jobService;

	 // Create a new job, Allowed user: ADMIN
    @PostMapping("/jobs")
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        return ResponseEntity.ok(jobService.createJob(job));
    }
    
    @GetMapping("jobs/all")
    public ResponseEntity<List<Job>> getAllJobs(){
    	return ResponseEntity.ok(jobService.getAllJobs());
    }
}
