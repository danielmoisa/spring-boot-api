package com.example.demo.course;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Course {
    @Id
    private Long id;
    private String title;
    private String description;
    private Integer price;
    @OneToMany(mappedBy = "student")
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
    private List<Course> courses;

    private Course(Long id, String title, String description, Integer price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer setPrice() {
        return price;
    }

    public void getPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", title='" + title + '\'' + '\'' + ", description='" + description + '\''
                + ", price=" + price + '}';
    }
}
