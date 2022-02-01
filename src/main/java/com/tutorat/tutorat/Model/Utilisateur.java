package com.tutorat.tutorat.Model;


import com.tutorat.tutorat.Enumeration.utilisateurEnu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;

    private String nomUtilisateur;
    private String prenom;
    private LocalDate age;
    private String matieres;
    private String etablissement;
    private String utilisateurLogin;
    private String addresse;
    private String utilisateurPassword;
    private Integer telephone;
    private Integer anciennete;
    private String classeEnseigner;

    @Enumerated(EnumType.STRING)
    private utilisateurEnu utilisateurEnu = com.tutorat.tutorat.Enumeration.utilisateurEnu.oui;

}
