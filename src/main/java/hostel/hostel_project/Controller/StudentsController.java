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

import hostel.hostel_project.Model.Students;
import hostel.hostel_project.Service.StudentService;

@RestController
@RequestMapping("student")
public class StudentsController {

	@Autowired
	private StudentService sr;

	@GetMapping("getstudent")
	public List<Students> getMapping() {
		return sr.getStudent();

	}

	@PostMapping("poststudent")
	public String insert(@RequestBody Students students) {
		return sr.insertStudent(students);
	}

	@PutMapping("putstudent")
	public String update(@RequestBody Students s) {
		return "Updated :" + StudentService.update(s);

	}

	@DeleteMapping("deletestudent")
	public String delete(@RequestParam String id) {
		return StudentService.deleteById(id);

	}

}
