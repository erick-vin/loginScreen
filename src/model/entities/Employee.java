package model.entities;

public class Employee {
	
	private Integer id;
	private String name;
	private String password;
	private String email;
	private String nameMother;
	private String nameFather;
	
	public Employee() {
	}
	
	

	public Employee(String name, String password, String email, String nameMother, String nameFather) {

		this.name = name;
		this.password = password;
		this.email = email;
		this.nameMother = nameMother;
		this.nameFather = nameFather;
	}



	public Employee(Integer id, String name, String password, String email, String nameMother, String nameFather) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.nameMother = nameMother;
		this.nameFather = nameFather;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameMother() {
		return nameMother;
	}

	public void setNameMother(String nameMother) {
		this.nameMother = nameMother;
	}

	public String getNameFather() {
		return nameFather;
	}

	public void setNameFather(String nameFather) {
		this.nameFather = nameFather;
	}
}
