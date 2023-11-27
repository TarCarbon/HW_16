package com.example.HW_15.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class Note {
    private long id;
    private String title;
    private String content;
}
