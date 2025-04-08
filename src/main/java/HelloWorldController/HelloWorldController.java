package HelloWorldController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Controller")
public class HelloWorldController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World";
	}
}
