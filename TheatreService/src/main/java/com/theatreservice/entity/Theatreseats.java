package com.theatreservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "theatre_seats")
public class Theatreseats {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer seatId;
	private Integer seatNumber;
	@ManyToOne(targetEntity = TheatreScreen.class)
	@JoinColumn(name = "screen_id")
	private TheatreScreen screen;
	public Integer getSeatId() {
		return seatId;
	}
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public Integer getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}
	public TheatreScreen getScreen() {
		return screen;
	}
	public void setScreen(TheatreScreen screen) {
		this.screen = screen;
	}
	
	
	
}
