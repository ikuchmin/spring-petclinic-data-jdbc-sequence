package ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.owner;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.LinkedHashSet;
import java.util.Set;

@Table("owner")
public class Owner {

    @Id
    @Column("id")
    private Long id;

    @Column("last_name")
    private String lastName;

    @Column("first_name")
    private String firstName;

    @MappedCollection
    private Set<OwnerPetRef> ownerPetRefs = new LinkedHashSet<>();

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Set<OwnerPetRef> getOwnerPetRefs() {
        return ownerPetRefs;
    }

    public void setOwnerPetRefs(Set<OwnerPetRef> ownerPetRefs) {
        this.ownerPetRefs = ownerPetRefs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}