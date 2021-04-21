package com.ticket.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController

public class TrainController {
	
	@RequestMapping(value = "/abc")
    public String getHi() {
        System.out.println("End Point hit");
        return "Hi";
    }

	@Autowired
	TrainService trainService;

	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/addtrain", method = RequestMethod.POST)
	public Map<String, Object> addTrain(@RequestBody Train train) {
		Map<String, Object> response = new HashMap<>();

		trainService.create(train);

		response.put("message", "Train details added successfully!");
		response.put("train", train);
		return response;
	}

	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/gettrains")
	public @ResponseBody List<Train> getTrains() {

		return trainService.findAll();
	}

	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/updateTrain", method = RequestMethod.POST)
	public Map<String, Object> updateTrain(@RequestBody Train train) {
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			trainService.update(train);
			response.put("message", "Train updated successfully!");
		} catch (Exception e) {
			response.put("message", "Update error" + e.toString());
		}

		response.put("train", train);
		return response;
	}

	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/getsearchdetails", method = RequestMethod.GET)
	public Map<String, Object> getsearchdetails(@RequestParam("sourceStation") String sourceStation, @RequestParam("destinationStation") String destinationStation,

			@RequestParam("trainType") String type,
			@RequestParam("day") int day)  
			 {
		Map<String, Object> response = new HashMap<String, Object>();
		try {

			response.put("message", "Search successful!");
			response.put("list", trainService.find(sourceStation, destinationStation, day, type));
			
		} catch (Exception e) {
			response.put("message", "Error" + e.toString());
		}

		System.out.println(response);
		return response;
		

	}
	
	/*book*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
