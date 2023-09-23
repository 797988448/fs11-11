package com.validation.validation.Repo;

import com.validation.validation.model.Validation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IValidationRepo extends CrudRepository<Validation,Integer> {
}
