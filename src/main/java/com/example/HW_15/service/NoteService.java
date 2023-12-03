package com.example.HW_15.service;

import com.example.HW_15.model.Note;

import java.util.List;
import java.util.Map;

public interface NoteService {
    public List<Note> listAll();
    public Note add (Note note);
    public void deleteById(long id);
    public void update (Note note);
    public Note getById(long id);

    public Map<Long, Note> getNotes();
}
