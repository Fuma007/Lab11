package se331.lab11.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se331.lab11.dao.ParticipantDao;
import se331.lab11.entity.Participant;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService {
    final ParticipantDao participantDao;

    @Override
    public List<Participant> getAllParticipants() {
        return participantDao.getAllParticipants();
    }

    @Override
    public Participant getParticipant(Long id) {
        return participantDao.getParticipant(id);
    }
}