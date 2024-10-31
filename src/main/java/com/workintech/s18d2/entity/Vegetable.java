package com.workintech.s18d2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.pl.NIP;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vegetabale", schema = "fsweb")
public class Vegetable extends Plant {
    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;
}
