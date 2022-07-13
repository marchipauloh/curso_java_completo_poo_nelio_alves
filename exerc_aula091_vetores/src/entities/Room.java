package entities;

public class Room {

	private String nameTenant;
	private String emailTenant;
	
	public Room(String nameTenant, String emailTenant) {
		this.nameTenant = nameTenant;
		this.emailTenant = emailTenant;
	}
	
	public String getNameTenant() {
		return nameTenant;
	}
	public void setNameTenant(String nameTenant) {
		this.nameTenant = nameTenant;
	}
	public String getEmailTenant() {
		return emailTenant;
	}
	public void setEmailTenant(String emailTenant) {
		this.emailTenant = emailTenant;
	}	
}
