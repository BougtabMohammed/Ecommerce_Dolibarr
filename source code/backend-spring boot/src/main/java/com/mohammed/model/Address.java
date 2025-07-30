package com.mohammed.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


// Indique que cette classe est une entité JPA (persistée dans une base de données)
@Entity

// Génère automatiquement les getters pour tous les champs
@Getter

// Génère automatiquement les setters pour tous les champs
@Setter

// Génère un constructeur avec tous les arguments (tous les champs)
@AllArgsConstructor

// Génère un constructeur sans arguments (constructeur par défaut)
@NoArgsConstructor

// Génère automatiquement les méthodes equals() et hashCode() basées sur les champs de la classe
@EqualsAndHashCode
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	private String name;
	

	private String locality;
	

    private String address;


    private String city;


    private String state;


    private String pinCode;

    
    private String mobile;


}
