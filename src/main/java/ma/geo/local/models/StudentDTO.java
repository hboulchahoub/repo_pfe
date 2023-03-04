package ma.geo.local.models;

public class StudentDTO {
    private String label;
    private String code;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "label=" + label +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
