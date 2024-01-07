package ma.emsi.springsec.service;

import ma.emsi.springsec.model.Note;
import ma.emsi.springsec.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceNote {
    @Autowired
    NoteRepository noteRepository;
    public List<Note> listeNote(){
        return noteRepository.findAll();
    }
    public List<Note> listeNoteParUser(String nom){
        return noteRepository.getNotesByUsername(nom);
    }
}
