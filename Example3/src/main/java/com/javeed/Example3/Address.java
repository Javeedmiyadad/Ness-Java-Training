package com.javeed.Example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Address {
	@Value(value = "house 1")
	private String houseNumber;
	@Value(value = "city 1")
	private String city;
	@Value(value = "country 1")
	private String country;

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + ", country=" + country + "]";
	}

}
