package com.training.first.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.training.first.domain.Sample;

@Component
public interface SampleRepository extends CrudRepository <Sample, Long>{

}
