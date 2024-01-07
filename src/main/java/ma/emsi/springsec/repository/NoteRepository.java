package ma.emsi.springsec.repository;

import ma.emsi.springsec.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    public List<Note> getNotesByUsername(String nom);
}
