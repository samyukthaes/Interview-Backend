package com.USTInterviewScheduler.FeedBackForm.controller;

import com.USTInterviewScheduler.FeedBackForm.entity.Candidate;
import com.USTInterviewScheduler.FeedBackForm.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feedback")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/emp")
    public Candidate createCandidate(@RequestBody Candidate candidate) {
        return candidateService.createCandidate(candidate);
    }

    @GetMapping("/candidate")
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }


    @GetMapping("/{id}")
    public Optional<Candidate> getCandidateById(@PathVariable Long id) {
        return candidateService.getCandidateById(id);
    }


    @DeleteMapping("/emp/{id}")
    public void deleteCandidate(@PathVariable Long id) {
        candidateService.deleteCandidate(id);
    }
}

