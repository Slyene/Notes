package com.devlab.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.devlab.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.devlab.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class GetNoteById(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}