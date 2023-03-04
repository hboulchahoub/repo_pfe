package ma.geo.local.mappers;

import ma.geo.local.entities.Adresse;
import ma.geo.local.entities.StudentEntity;
import ma.geo.local.entities.StudentId;
import ma.geo.local.models.StudentDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")
public class StudentMapper {

    public StudentEntity studentDtoToEntity(StudentDTO dto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentId(new StudentId(dto.getLabel(),dto.getCode()));
        studentEntity.setName(dto.getName());
        studentEntity.setAdresse(new Adresse("rue1","avenu1","ville1"));
        return studentEntity;
    }

    public StudentDTO studentEntityToDto(StudentEntity studentEntity) {
        StudentDTO dto = new StudentDTO();
        dto.setLabel(studentEntity.getStudentId().getLabel());
        dto.setCode(studentEntity.getStudentId().getCode());
        dto.setName(studentEntity.getName());
        return dto;
    }

    public List<StudentDTO> studentEntiesToDtos(List<StudentEntity> studentEntities) {
        if(studentEntities!=null&&!studentEntities.isEmpty()){
            return studentEntities.stream().map(studentEntity -> studentEntityToDto(studentEntity)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }
}
