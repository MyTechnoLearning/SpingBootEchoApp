package kidea.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
	
	@RequestMapping("/")
	public String healthCheck() {
		return "Nothing to echo";
	}
	
	@RequestMapping("/echo")
	public String getPerson(@RequestParam(name="word", required=false, defaultValue="Unknown") String word) {
		//person.setName(name);
		
		return "Echoing "+ word;
	}

}
