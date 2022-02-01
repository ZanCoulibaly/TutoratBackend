package com.tutorat.tutorat.Controller;


import com.tutorat.tutorat.Model.Utilisateur;
import com.tutorat.tutorat.Repository.RepositoryUtilisateur;
import com.tutorat.tutorat.Service.ServiceImpUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "/api")
public class utilisateurController {
    @Autowired
    ServiceImpUtilisateur serviceImpUtilisateur;
    @Autowired
    RepositoryUtilisateur repositoryUtilisateur;

    @PostMapping("/addUser")
    public Utilisateur ajouterUser(@RequestBody Utilisateur utilisateur){
      return   serviceImpUtilisateur.ajouterUser(utilisateur);
    }

    @GetMapping("/login")
    public Utilisateur verifyLoginAndPassword(@RequestParam String login, @RequestParam String password){
    return  serviceImpUtilisateur.verifyLoginAndPassword(login, password);
   }
}
