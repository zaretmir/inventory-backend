package com.empresa.user_profile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.empresa.app_user.model.AppUser;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "appuserprofile")
@Getter @Setter
/*@JsonIdentityInfo(
	generator = ObjectIdGenerators.PropertyGenerator.class,
	property = "id")*/
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@MapsId
	@JsonManagedReference
	private AppUser user;
	
	@Column(name = "first_name")
	private String name;

	@Column(name = "family_name")
	private String surname;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone_number")
	private Integer phoneNumber;

}