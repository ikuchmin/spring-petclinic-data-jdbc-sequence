package ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.pet;

import org.springframework.data.repository.ListCrudRepository;

public interface PetRepository extends ListCrudRepository<Pet, Long> {
}