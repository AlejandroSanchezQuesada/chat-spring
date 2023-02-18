package alesan.chatspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextMessageDTO {

	private String userName;
	private String message;

	public String messageWithUserName() {
		return userName + message;
	}

}
