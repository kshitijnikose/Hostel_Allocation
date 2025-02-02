package hostel.hostel_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hostel.hostel_project.Model.Wings;
import hostel.hostel_project.Service.WingsService;

@RestController
@RequestMapping("wings")
public class WingsController {

	@Autowired
	private WingsService wingsService;

	@GetMapping("getwings")
	public List<Wings> getWings() {

		return wingsService.getWings();

	}

	@PostMapping("postwings")
	public String insertWing(@RequestBody Wings room) {

		return "Inserted Wing :  " + wingsService.insertWing(room);
	}

	@PutMapping("putwings")
	public void update(@RequestBody Wings wings) {

		wingsService.update(wings);
	}

	@DeleteMapping("deletwings")
	public String delete(@RequestParam String id) {

		wingsService.delete(id);
		return "Deleted";

	}

}
