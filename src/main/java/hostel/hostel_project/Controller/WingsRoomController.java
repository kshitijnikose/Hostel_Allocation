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

import hostel.hostel_project.Model.WingsRoom;
import hostel.hostel_project.Service.WingRoomService;

@RestController
@RequestMapping("rooms")
public class WingsRoomController {

	@Autowired
	private WingRoomService rs;

	@GetMapping("getrooms")
	public List<WingsRoom> showRoomsData() {
		return rs.getAllWings();
	}

	@PostMapping("inputrooms")
	public String insertRoom(@RequestBody WingsRoom Room) {
		return "insert" + rs.insertRoom(Room);
	}

	@PutMapping("putroom")
	public void updateRoom(@RequestBody WingsRoom room) {
		rs.update(room);

	}

	@DeleteMapping("deleteroom")
	public String delete(@RequestParam String id) {
		rs.delete(id);
		return "Deleted   ";

	}

}
