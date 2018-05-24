package com.training.first.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.first.domain.Sample;

@Service
@Transactional
public class SampleService {
	@Autowired
	private SampleRepository sampleRepository;
	
	public Sample save(Sample sample) {
		return sampleRepository.save(sample);
	}
	
	
	public Optional<Sample> findById(Long id) {
		return sampleRepository.findById(id);
	}
	
	public Iterable<Sample> findAll(){
		Iterable<Sample> result = sampleRepository.findAll();
		return result;
	}
}
