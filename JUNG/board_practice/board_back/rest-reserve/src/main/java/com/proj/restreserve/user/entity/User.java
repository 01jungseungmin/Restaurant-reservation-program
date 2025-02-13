package com.proj.restreserve.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collections;
import java.util.Set;

@Entity
@Data
@Table(name="user")
public class User {

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userid;

    @Column(name = "useremail", unique = true, nullable = false)
    private String useremail;

    @Column(name ="password", nullable = false)
    private String password;

    @Column(name ="username", nullable = false)
    private String username;

    @Column(name ="phone", nullable = false)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name ="role", nullable = false)
    private Role role;

    @Column(name="ban", nullable = false)
    private Boolean ban;

    @ManyToOne
    @JoinColumn(name = "businessid")
    private BusinessNumber businessnumber;

    public Set<Role> getRoles() {
        return Collections.singleton(this.role);
    }
}