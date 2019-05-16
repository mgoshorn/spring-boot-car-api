package com.revature.models;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

/**
 * JSR-380 Specification Document: 
 * {@link https://beanvalidation.org/2.0/spec/#builtinconstraints-email}
 * @author mitch
 *
 */

public class Car {
	
	@Range(min=0, max=50)
	private int id;

	@Length(min=1, max=100)
	private String make;
	
	@Pattern(regexp = "")
	private String model;

	@NotNull(message = "Car must have a color")
	private String color;

	@Future
	private LocalDate releaseDate;

	@Email
	private String cylinders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCylinders() {
		return cylinders;
	}

	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((cylinders == null) ? 0 : cylinders.hashCode());
		result = prime * result + id;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
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
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (cylinders == null) {
			if (other.cylinders != null)
				return false;
		} else if (!cylinders.equals(other.cylinders))
			return false;
		if (id != other.id)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", releaseDate="
				+ releaseDate + ", cylinders=" + cylinders + "]";
	}

	public Car(int id, String make, String model, @NotNull(message = "Car must have a color") String color,
			LocalDate releaseDate, String cylinders) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.color = color;
		this.releaseDate = releaseDate;
		this.cylinders = cylinders;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

}
