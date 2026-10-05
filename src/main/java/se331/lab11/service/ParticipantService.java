package se331.lab11.service;

import se331.lab11.entity.Participant;

import java.util.List;

public interface ParticipantService {
    List<Participant> getAllParticipants();
    Participant getParticipant(Long id);
}