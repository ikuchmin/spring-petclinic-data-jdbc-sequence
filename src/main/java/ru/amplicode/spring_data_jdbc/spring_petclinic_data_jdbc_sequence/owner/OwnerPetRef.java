package ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.owner;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.pet.Pet;

@Table("owner_pet_ref")
public record OwnerPetRef(
        @Id
        @Column("id")
        Long id,

        @Column("pet_id")
        AggregateReference<Pet, Long> pet) {
}