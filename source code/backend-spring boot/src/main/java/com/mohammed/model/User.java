package com.mohammed.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mohammed.domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {
    //pour generer id directement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // La permition de Ecrire Seulement le mot de passe et non de Lire
    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    // @Column(nullable = false) c-a-d que la colonne ne peut pas contenir de valeur NULL
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String fullName;

    private String mobile;

    private USER_ROLE role;

    // 1 User peut avoir 1 ou plusieurs Address
    @OneToMany
    private Set<Address> addresses=new HashSet<>();

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "user_coupons",
            inverseJoinColumns = @JoinColumn(name = "coupon_id")
    )
    private Set<Coupon> usedCoupons=new HashSet<>();

}
