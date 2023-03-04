package ma.geo.local.services;

import ma.geo.local.models.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO save(StudentDTO s);

    StudentDTO update(StudentDTO s);

    void delete(Long id);

    List<StudentDTO> selectAll();
}
