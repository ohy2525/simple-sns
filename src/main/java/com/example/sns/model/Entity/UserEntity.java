package com.example.sns.model.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class UserEntity {

    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String password;
}
