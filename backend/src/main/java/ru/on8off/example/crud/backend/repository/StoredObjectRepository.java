package ru.on8off.example.crud.backend.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.on8off.example.crud.backend.repository.entity.StoredObject;

public interface StoredObjectRepository extends CrudRepository<StoredObject, Integer>, PagingAndSortingRepository<StoredObject, Integer> {}
