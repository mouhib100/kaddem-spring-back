package tn.esprit.kaddemspring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipe ;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private DetailsEquipe detailsequipe;
    @ManyToMany()
    @JsonIgnore
    private Set<Etudiant> EtudiantSet;

}
