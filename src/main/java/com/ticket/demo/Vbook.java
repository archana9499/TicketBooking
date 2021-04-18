package com.ticket.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="vbookInfo")
public class Vbook {
	
	@Id
	private int id;
	private String name, trainId, sourceStation, destinationStation;
	double fare;
	
	
	
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
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public Vbook(int id, String name, String trainId, String sourceStation, String destinationStation, double fare) {
		super();
		this.id = id;
		this.name = name;
		this.trainId = trainId;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Vbook [id=" + id + ", name=" + name + ", trainId=" + trainId + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", fare=" + fare + "]";
	}
	
	
	
	
	
	
}
