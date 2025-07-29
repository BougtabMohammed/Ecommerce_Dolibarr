package com.zosh.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;


    // Relation OneToMany entre cette entité (par exemple Cart) et l'entité CartItem.
    // 1- mappedBy = "cart" : signifie que le champ "cart" dans
    // la classe CartItem est le propriétaire de la relation.
    // 2- cascade = CascadeType.ALL : toutes les opérations (persist, merge, remove, etc.)
    // effectuées sur Cart seront propagées à ses CartItems.
    // 3- orphanRemoval = true : si un CartItem est retiré de la collection cartItems,
    // il sera automatiquement supprimé de la base de données

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CartItem> cartItems = new HashSet<>();

    private double totalSellingPrice;

    private int totalItem;
    
    private int totalMrpPrice;
    
    private int discount;

    private String couponCode;
    private int couponPrice;


}
