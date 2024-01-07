package ma.emsi.springsec.controller;

import ma.emsi.springsec.model.Note;
import ma.emsi.springsec.service.ServiceNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    ServiceNote serviceNote;
    @GetMapping("/notes")
    public List<Note> getAllNote(){
        return serviceNote.listeNote();
    }
    @GetMapping("/notesUser")
    public List<Note> getNoteParUser(){
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        return serviceNote.listeNoteParUser(userName);
    }
}
