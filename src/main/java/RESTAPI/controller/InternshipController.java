package RESTAPI.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternshipController {

	@GetMapping("/internships")
	public List<Map<String, String>> getInternships() {
		List<Map<String, String>> internships = new ArrayList<>();

		Map<String, String> post1 = new HashMap<>();
		post1.put("title", "Java Developer Intern");
		post1.put("duration", "3 Months");
		post1.put("stipend", "10,000");
		internships.add(post1);

		Map<String, String> post2 = new HashMap<>();
		post2.put("title", "Frontend Intern (React)");
		post2.put("duration", "3 Months");
		post2.put("stipend", "10,000");
		internships.add(post2);

		Map<String, String> post3 = new HashMap<>();
		post3.put("title", "Data Science Intern");
		post3.put("duration", "3 Months");
		post3.put("stipend", "10,000");
		internships.add(post3);
		return internships;
	}
}
