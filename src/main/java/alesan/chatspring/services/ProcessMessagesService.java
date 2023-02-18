package alesan.chatspring.services;

import org.springframework.stereotype.Service;

import alesan.chatspring.dto.TextMessageDTO;

@Service
public class ProcessMessagesService {

	public String processMessageWithUsername(TextMessageDTO dto) {
		if (dto.getUserName() == null) {
			dto.setUserName("anonimo");
		}
		return dto.getUserName() + ": " + dto.getMessage();

	}

}
