package alesan.chatspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import alesan.chatspring.dto.TextMessageDTO;
import alesan.chatspring.services.ProcessMessagesService;

@RestController
public class WebSocketTextController {
	@Autowired
	SimpMessagingTemplate template;

	@Autowired
	ProcessMessagesService messagesService;

	@PostMapping("/send")
	public ResponseEntity<Void> sendMessage(@RequestBody TextMessageDTO message) {
		message.setMessage(messagesService.processMessageWithUsername(message));
		template.convertAndSend("/topic/message", message);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@MessageMapping("/sendMessage")
	public void receiveMessage(@Payload TextMessageDTO textMessageDTO) {
		// receive message from client
		System.out.println("recibido mensaje del cliente: " + textMessageDTO);
	}

	@SendTo("/topic/message")
	public TextMessageDTO broadcastMessage(@Payload TextMessageDTO textMessageDTO) {
		System.out.println("recibido al broadcast " + textMessageDTO.toString());
		return textMessageDTO;
	}

}