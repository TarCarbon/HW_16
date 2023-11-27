package com.example.HW_15.impl;

import com.example.HW_15.service.Note;
import com.example.HW_15.service.NoteService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NoteServiceImpl implements NoteService {

   final private Map<Long, Note> notes = new HashMap<>();
    private long idCounter = 0;


    @Override
    public List<Note> ListAll() {
        return new ArrayList<>(notes.values());
    }

    @Override
    public Note add(Note note) {
        note.setId(++idCounter);
        notes.put(note.getId(), note);
        return note;
    }

    @Override
    public void deleteById(long id) {
        if (!notes.containsKey(id)) {
            throw new IllegalArgumentException("Note with id " + id + " does not exist");
        }
        notes.remove(id);
    }

    @Override
    public void update(Note note) {
        long id = note.getId();
        if (!notes.containsKey(id)) {
            throw new IllegalArgumentException("Note with id " + id + " does not exist");
        }
        notes.put(id, note);
    }

    @Override
    public Note getById(long id) {
        if (!notes.containsKey(id)) {
            throw new IllegalArgumentException("Note with id " + id + " does not exist");
        }
        return notes.get(id);
    }
}
