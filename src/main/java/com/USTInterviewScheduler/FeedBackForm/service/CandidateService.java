package com.USTInterviewScheduler.FeedBackForm.service;

import com.USTInterviewScheduler.FeedBackForm.entity.Candidate;
import com.USTInterviewScheduler.FeedBackForm.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public Candidate createCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }


    public void deleteCandidate(Long id) {
        candidateRepository.deleteById(id);
    }

    public Optional<Candidate> getCandidateById(Long id) {
        return candidateRepository.findAllById(id);
    }
}
