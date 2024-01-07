package ma.emsi.springsec.controller;

import ma.emsi.springsec.model.Etudiant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class EtudiantController {
    @GetMapping("/liste")
    public List<Etudiant> getEtudiants(){
        return List.of(
                new Etudiant(1,"Lamrani","Yousra"),
                new Etudiant(2,"Tarar","Ayman"),
                new Etudiant(3,"Kessou","Abderrahman")
        );
    }
    @GetMapping("/msg")
    public String getMessage(){
        return "Utilisateurs";
    }
    @GetMapping("/")
    public RedirectView redirectView() {
        return new RedirectView("/liste");
    }
}
