package org.example.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> Addresses;
    private Map<String, String> courses;
    private Properties props;

    public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties props) {
        this.name = name;
        this.phones = phones;
        Addresses = addresses;
        this.courses = courses;
        this.props = props;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return Addresses;
    }

    public void setAddresses(Set<String> addresses) {
        Addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp() {
        super();
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", Addresses=" + Addresses +
                ", courses=" + courses +
                ", props=" + props +
                '}';
    }
}
