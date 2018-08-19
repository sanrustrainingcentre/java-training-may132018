package serialization;

public class Contact {
	
	
	private String fName;
	private String lName;
	private String email;
	private String phNumber;
	/**
	 * @param fName
	 * @param lName
	 */
	public Contact(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phNumber
	 */
	public String getPhNumber() {
		return phNumber;
	}
	/**
	 * @param phNumber the phNumber to set
	 */
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", email=" + email + ", phNumber=" + phNumber + "]";
	}
	
	
	

}
