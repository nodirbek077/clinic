package uz.nanotechsolutions.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nanotechsolutions.clinic.entity.User;

public interface PatientRepository extends JpaRepository<User,Integer> {

}
