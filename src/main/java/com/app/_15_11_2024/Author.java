package com.app._15_11_2024;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @Column
    private int id;

    @Column
    private String name;
}