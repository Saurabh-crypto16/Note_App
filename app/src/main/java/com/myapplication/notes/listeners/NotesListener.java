package com.myapplication.notes.listeners;

import com.myapplication.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note,int position);
}
