package ma.geo.local.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentId implements Serializable {

    private String label;
    private String code;

    public StudentId(String label, String code) {
        this.label = label;
        this.code = code;
    }

    public StudentId() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentId studentId = (StudentId) o;
        return label.equals(studentId.label) && code.equals(studentId.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, code);
    }

    @Override
    public String toString() {
        return "StudentId{" +
                "label='" + label + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
