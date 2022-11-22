package com.tp2.service;

import com.tp2.entity.Career;
import com.tp2.repository.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CareerService {
    @Autowired
    private CareerRepository careerRepository;

    public List<Career> getCareersOrderByStudents() {
        return careerRepository.getAllCareersByStudentsAmount();
    }

    public List<Career> getCareers() {
        return careerRepository.getCareers();
    }
}
