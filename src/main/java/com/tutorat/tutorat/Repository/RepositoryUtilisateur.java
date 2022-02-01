package com.tutorat.tutorat.Repository;


import com.tutorat.tutorat.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUtilisateur extends JpaRepository<Utilisateur, Long> {
    @Query("SELECT app FROM Utilisateur app WHERE app.utilisateurLogin = :login and app.utilisateurPassword = :password")
    public Utilisateur verifyLoginPassword(@Param("login") String login, @Param("password") String password);
}
