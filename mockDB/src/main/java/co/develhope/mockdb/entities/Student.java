package co.develhope.mockdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name="id_student")
    private long id;

    @Column(name="first_name_student")
    private String firstName;
    @Column(name="last_name_student")
    private String lastName;

    @Column(name="email_student",unique = true)
    private String email;
}