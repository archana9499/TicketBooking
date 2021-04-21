package com.ticket.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VbookController {

	@RequestMapping(value = "/vbook")
	public String getHi() {
		System.out.println("vbook works");
		return "Hi";
	}

	@Autowired
	VbookService vbookService;

	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/getbookingdetails", method = RequestMethod.GET)
	public Map<String, Object> getsearchdetails(@RequestParam("sourceStation") String sourceStation,
			@RequestParam("destinationStation") String destinationStation,

			@RequestParam("name") String name, @RequestParam("trainId") String trainId,
			@RequestParam("fare") double fare) {
		Map<String, Object> response = new HashMap<String, Object>();
		try {

			response.put("message", "Book Search successful!");
			response.put("list", vbookService.find(sourceStation, destinationStation, name, trainId, fare));
		} catch (Exception e) {
			response.put("message", "Error" + e.toString());
		}

		return response;

	}
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public Map<String, Object> bookTrain(@RequestBody Vbook vbook) {
		Map<String, Object> response = new HashMap<>();

		vbookService.create(vbook);

		// edit below till response

		response.put("message", "Booking added successfully!");
		response.put("vbook", vbook);
		return response;

		// do a rest call to payment
	}

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value = "/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		
		return vbookService.saveOrder(request);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
