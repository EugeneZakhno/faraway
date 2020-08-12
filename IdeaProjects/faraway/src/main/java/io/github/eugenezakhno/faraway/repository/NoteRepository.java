package io.github.eugenezakhno.faraway.repository;

import io.github.eugenezakhno.faraway.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}