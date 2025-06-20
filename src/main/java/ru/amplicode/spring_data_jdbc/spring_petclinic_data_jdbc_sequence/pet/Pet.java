package ru.amplicode.spring_data_jdbc.spring_petclinic_data_jdbc_sequence.pet;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Sequence;
import org.springframework.data.relational.core.mapping.Table;

@Table("pet")
public class Pet {

    @Id
    @Sequence(sequence = "pet_seq")
    @Column("id")
    private Long id;

    @Column("nickname")
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}