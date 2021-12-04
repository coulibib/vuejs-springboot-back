package net.springvue.springboot.entity;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_nam", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;

}
