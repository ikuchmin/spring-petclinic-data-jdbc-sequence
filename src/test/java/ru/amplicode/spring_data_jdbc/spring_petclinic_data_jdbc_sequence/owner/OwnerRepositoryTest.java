package ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.owner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.pet.Pet;
import ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.pet.PetRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OwnerRepositoryTest {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    void checkBatchInsertIsWorkingForMappedCollection() {
        // given
        Pet rex = new Pet();
        rex.setNickname("Rex");

        Pet bella = new Pet();
        bella.setNickname("Bella");

        Pet lucy = new Pet();
        lucy.setNickname("Lucy");

        Pet max = new Pet();
        max.setNickname("Max");

        Pet charlie = new Pet();
        charlie.setNickname("Charlie");

        Pet molly = new Pet();
        molly.setNickname("Molly");

        petRepository.saveAll(List.of(rex, bella, lucy, max, charlie, molly));

//        Owner owner = new Owner();
//        owner.setFirstName("John");
//        owner.setLastName("Doe");
//
//        // when
//        owner.getOwnerPetRefs().addAll(List.of(
//                new OwnerPetRef(null, AggregateReference.to(rex.getId())),
//                new OwnerPetRef(null, AggregateReference.to(bella.getId())),
//                new OwnerPetRef(null, AggregateReference.to(lucy.getId()))
//        ));
//
//        owner = ownerRepository.save(owner);
//
//        // when 2
//        owner.getOwnerPetRefs().addAll(List.of(
//                new OwnerPetRef(null, AggregateReference.to(max.getId())),
//                new OwnerPetRef(null, AggregateReference.to(charlie.getId())),
//                new OwnerPetRef(null, AggregateReference.to(molly.getId()))
//        ));
//
//        ownerRepository.save(owner);
    }

}