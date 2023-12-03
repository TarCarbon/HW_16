package com.example.HW_15.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
@AllArgsConstructor
public class Note {
    private long id;
    private String title;
    private String content;
}
