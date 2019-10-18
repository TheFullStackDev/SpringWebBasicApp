package com.dhub;

import java.time.LocalTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greeting() {
		return "Welcome to Spring Web Basic App";
	}
	
	@GetMapping("/user")
	public ResponseEntity<String> getDtls(@RequestParam(required = false) String time, @RequestParam(value="name") String userName) {
		boolean isClosed = false;
		LocalTime currentTime = LocalTime.now();
		LocalTime serverTime = LocalTime.parse("16:00:00");
		if(time == null) {
			if(currentTime.isBefore(serverTime)) {
				time = "Morning";
			}else if(currentTime.isAfter(serverTime) || currentTime.equals(serverTime)) {
				isClosed = true;
			}
		}else {
			time = "Day";
		}
		
		if(isClosed) return ResponseEntity.badRequest().body("Hurry Up!!!, Window will be closed after 10 mins.") ;
		
		return ResponseEntity.ok("Good "+time+" , "+userName);
	}
	
	@GetMapping("/user/details")
	public User getUserDtls() {
		return new User("Dibas", "Developer","Mumbai");
	}
	
	
}

