package tn.esprit.kaddemspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddemspring.model.Equipe;
import tn.esprit.kaddemspring.model.Etudiant;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
