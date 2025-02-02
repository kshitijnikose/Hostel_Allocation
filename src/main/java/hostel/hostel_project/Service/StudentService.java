package hostel.hostel_project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hostel.hostel_project.Model.Students;
import hostel.hostel_project.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private static StudentRepo studentRepo;

    public List<Students> getStudent() {

        return studentRepo.findAll();

    }

    public String insertStudent(Students s) {

        return "Inserted Student is " + studentRepo.save(s);

    }

    public Optional<Students> getByid(String id) {

        return studentRepo.findById(id);

    }

    public static Students update(Students s) {

        return studentRepo.save(s);

    }

    public static String deleteById(String id) {

        studentRepo.deleteById(id);

        return "Deleted";
    }

}
