package com.devrev.apilives.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Live implements Serializable{

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private String liveName;
	private String channelName;
	private LocalDateTime liveDate;
	private String liveLink;
	private LocalDateTime registrationDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLiveName() {
		return liveName;
	}
	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public LocalDateTime getLiveDate() {
		return liveDate;
	}
	public void setLiveDate(LocalDateTime liveDate) {
		this.liveDate = liveDate;
	}
	public String getLiveLink() {
		return liveLink;
	}
	public void setLiveLink(String liveLink) {
		this.liveLink = liveLink;
	}
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Live other = (Live) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Live [id=" + id + ", liveName=" + liveName + ", channelName=" + channelName + ", liveDate=" + liveDate
				+ ", liveLink=" + liveLink + ", registrationDate=" + registrationDate + "]";
	}
	
	
	
}
