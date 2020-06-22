package io.learnk8s.knote.repository;

import io.learnk8s.knote.domain.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Note, String> {

}