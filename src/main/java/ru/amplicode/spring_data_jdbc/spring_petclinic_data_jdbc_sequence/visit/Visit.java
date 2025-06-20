package ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.visit;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("visit")
public class Visit {

    @Id
    @Column("id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}