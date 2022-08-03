package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;
    
    @OneToMany
    @JoinColumn(name ="publisher_id")
    private Set<Book> books = new HashSet<>();
	
	public Publisher() {
		super();
	}
	
	

	public Publisher(String name, String addressLine1, String city, String state, String zip) {
		super();
		this.name = name;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	

	public Set<Book> getBooks() {
		return books;
	}



	public void setBooks(Set<Book> books) {
		this.books = books;
	}



	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddressLine1() {
		return addressLine1;
	}



	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	

	@Override
	public String toString() {
		return "Publisher [Id=" + Id + ", name=" + name + ", addressLine1=" + addressLine1 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
	

}
