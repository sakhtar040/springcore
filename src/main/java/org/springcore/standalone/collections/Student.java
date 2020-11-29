package org.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
    private List<String> subjects;
    private Map<String, Integer> courses;
    private Properties properties;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjects=" + subjects +
                ", courses=" + courses +
                ", properties=" + properties +
                '}';
    }
}
