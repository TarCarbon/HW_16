package com.example.HW_15.service;

import java.util.List;

public interface NoteService {
    public List<Note> ListAll();
    public Note add (Note note);
    public void deleteById(long id);
    public void update (Note note);
    public Note getById(long id);
}
