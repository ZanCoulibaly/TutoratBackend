package com.tutorat.tutorat.Service;

import com.tutorat.tutorat.Model.Utilisateur;


public interface ServiceUtilisateur {
    public Utilisateur verifyLoginAndPassword(String utilisateurLogin, String utilisateurPassword);
    public Utilisateur ajouterUser(Utilisateur utilisateur);
}
