package com.tp2.service;

import java.util.List;
import com.tp2.entity.Student;
import com.tp2.repository.CareerStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tp2.dto.CareerInscriptionsDTO;
import com.tp2.dto.CareerReportDTO;

@Service
public class CareerStudentService {
	@Autowired
    private CareerStudentRepository careerStudentRepository;
	
	public List<Student> getStudentsByCareerFilterCity(Long idCarrera, String ciudad){
		return careerStudentRepository.getStudentsByCareerFilterCity(idCarrera, ciudad);
	}
	
	public List<CareerInscriptionsDTO> getInscriptionSortedByCareer(){
		return careerStudentRepository.getInscriptionSortedByCareer();
	}
	
	public List<CareerReportDTO> getReportCareer(){
		return careerStudentRepository.getReportCareer();
	}

}
