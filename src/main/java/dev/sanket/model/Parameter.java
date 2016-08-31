package dev.sanket.model;

public class Parameter {

    private int id;

    private String name;

    private String module;

    private String value;

    public static Parameter create(int id, String name, String module, String value) {

        Parameter parameter = new Parameter();

        parameter.setId(id);
        parameter.setName(name);
        parameter.setModule(module);
        parameter.setValue(value);

        return parameter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
