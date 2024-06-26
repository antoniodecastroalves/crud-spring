package com.antonio.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length =  200, nullable = false)
  private String name;

  @Column(length =  200, nullable = false)
  private String category; 
  
}
