package effigo.ayushi.training.equals;

import java.util.Objects;

public class Employe {
	private int id;
	private String name;
	
	public Employe(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.name.length();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Employe other = (Employe) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}
