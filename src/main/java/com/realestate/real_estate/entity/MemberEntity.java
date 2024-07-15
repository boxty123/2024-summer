package com.realestate.real_estate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30,nullable = false)
    private String name;

    @Column(length = 30,nullable = false)
    private String password;

}
