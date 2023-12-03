package com.example.HW_15.controller;

import com.example.HW_15.model.Note;
import com.example.HW_15.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RequestMapping("/note")
@Controller
public class NoteController {
private final NoteService noteService;
    @GetMapping("/list")
    public ModelAndView getAllList(Model model){
        ModelAndView result = new ModelAndView("list");
        model.addAttribute("nt", noteService.listAll());
        return result;
    }

    @GetMapping("/delete")
    public ModelAndView getDeleteById ( Model model){
        ModelAndView result = new ModelAndView("delete");
        return result;
    }

    @PostMapping("/delete")
    public String postDeleteById(@RequestParam(name ="id", required = false) int id){
            noteService.deleteById(id);
        return "redirect:/note/list";
    }

    @GetMapping("/edit")
    public ModelAndView getEditById( @RequestParam(name = "id") int id,Model model){
        ModelAndView result = new ModelAndView("edit");
        model.addAttribute("notes", noteService.getById(id));
        return result;
    }

    @PostMapping("/edit")
    public String postEdit(@RequestParam(name = "title") String title, @RequestParam(name = "edit-content") String content,  Note note){
        Note newNote = new Note(note.getId(), title, content );
        noteService.update(newNote);
        return "redirect:/note/list";
    }

}
