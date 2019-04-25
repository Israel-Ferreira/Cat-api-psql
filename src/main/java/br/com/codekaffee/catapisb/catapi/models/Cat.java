package br.com.codekaffee.catapisb.catapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter 
    private Long id;

    @Getter @Setter
    private String breedName;

    @Getter @Setter
    private String country;
}