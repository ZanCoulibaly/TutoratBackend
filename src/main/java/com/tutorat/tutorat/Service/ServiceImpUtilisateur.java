package com.tutorat.tutorat.Service;


import com.tutorat.tutorat.Model.Utilisateur;
import com.tutorat.tutorat.Repository.RepositoryUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpUtilisateur implements ServiceUtilisateur {
    @Autowired
    RepositoryUtilisateur repositoryUtilisateur;
    public ServiceImpUtilisateur(RepositoryUtilisateur repositoryUtilisateur){
        this.repositoryUtilisateur = repositoryUtilisateur;
    }


    @Override
    public Utilisateur verifyLoginAndPassword(String utilisateurLogin, String utilisateurPassword) {
        return null;
    }

    @Override
    public Utilisateur ajouterUser(Utilisateur utilisateur) {
        return repositoryUtilisateur.save(utilisateur);
    }
}
