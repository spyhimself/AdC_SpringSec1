package ma.emsi.springsec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {

    int id;
    String nom;
    String prenom;
}
