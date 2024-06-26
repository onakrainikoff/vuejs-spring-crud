package ru.on8off.example.crud.backend.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.on8off.example.crud.backend.repository.entity.StoredObject;

@RepositoryRestResource
public interface StoredObjectRepository extends CrudRepository<StoredObject, Integer>, PagingAndSortingRepository<StoredObject, Integer> {}
