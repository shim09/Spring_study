package com.shc.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shc.ex.dto.TraineeDTO;
import com.shc.ex.repository.TraineeRepository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRepository tr;

	public void insert(TraineeDTO trainee) {
		
		System.out.println("TraineeService.insert()메서드 호출");
		System.out.println("객체값" + trainee);
		
		tr.inesrt(trainee);
		
	}

}
