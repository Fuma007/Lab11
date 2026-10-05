package se331.lab11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab11.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}