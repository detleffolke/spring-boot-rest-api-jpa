package com.example.request;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentRequest {
	
	@JsonProperty("first_name")
	@NotBlank(message = "First name is required")
	private String firstName;
	@NotBlank(message = "last name is required")
	@JsonProperty("last_name")
	private String lastName;

	private String email;

}
