package com.skhu;

/**
 * Created by seungki on 2017-02-04.
 */
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
