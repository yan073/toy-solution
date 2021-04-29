package toy.common.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	@Id
	private String id;

	private String login;
	private String role;

	public String getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}	
	
	public String getRole() {
		return role;
	}	
}
