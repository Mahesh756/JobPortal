package com.example.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobportal.model.Application;
import com.example.jobportal.model.Job;
import com.example.jobportal.model.User;
import com.example.jobportal.repository.ApplicationRepository;
import com.example.jobportal.repository.JobRepository;
import com.example.jobportal.repository.UserRepository;

@Service
public class ApplicationService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	
	public Application applyForJob(Long userId, Long jobId) {
	    /* Fetch User object using userId or throw exception */
		User user = userRepository.findById(userId)
	        .orElseThrow(() -> new RuntimeException("User not found"));
		
		/* Fetch Job object using jobId or throw exception */
	    Job job = jobRepository.findById(jobId)
	        .orElseThrow(() -> new RuntimeException("Job not found"));
	    
	    /* Attach User and Job details to Application object */
	    Application application = new Application(user, job);
	    
	    /* Save it in DB using save() method of JpaRepository */
	    return applicationRepository.save(application);
	}
}
