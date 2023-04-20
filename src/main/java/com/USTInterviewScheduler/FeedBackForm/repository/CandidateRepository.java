package com.USTInterviewScheduler.FeedBackForm.repository;

import com.USTInterviewScheduler.FeedBackForm.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    List<Candidate> findAll();

    Candidate save(Candidate candidate);



    void deleteById(Long id);

    Optional<Candidate> findAllById(Long id);
}


