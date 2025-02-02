package hostel.hostel_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hostel.hostel_project.Model.Students;

public interface StudentRepo extends JpaRepository<Students, String> {

}
