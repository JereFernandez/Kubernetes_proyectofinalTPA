package com.example.persona.Entities;

import lombok.*;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Localidad extends Base {

    @NotAudited
    private String denominacion;
}
