package com.ticket.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="trainInfo")
public class Train {
	
    @Id
	private String id;
	private String name, trainId, sourceStation, destinationStation, type;
	double fare, distance;
	int seats, arrives, departs;
	int days;

	public Train(String id, String name, String trainId, String sourceStation, String destinationStation, String type,
			double fare, double distance, int seats, int arrives, int departs, int days) {
		super();
		this.id = id;
		this.name = name;
		this.trainId = trainId;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.type = type;
		this.fare = fare;
		this.distance = distance;
		this.seats = seats;
		this.arrives = arrives;
		this.departs = departs;
		this.days = days;

	}

	public Train() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getArrives() {
		return arrives;
	}

	public void setArrives(int arrives) {
		this.arrives = arrives;
	}

	public int getDeparts() {
		return departs;
	}

	public void setDeparts(int departs) {
		this.departs = departs;
	}

	

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", trainId=" + trainId + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", type=" + type + ", fare=" + fare + ", distance="
				+ distance + ", seats=" + seats + ", arrives=" + arrives + ", departs=" + departs + ", days=" + days
				+ "]";
	}

	


	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

