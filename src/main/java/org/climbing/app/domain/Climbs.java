package org.climbing.app.domain;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "climbs")
@Entity
public class Climbs {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "grade")
    private String grade;

    @Column(name = "location")
    private String location;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "stars")
    private Integer stars;

    @Convert(converter = ClimbTypeConverter.class)
    @Column(name = "type")
    private ClimbType type;

    @Column(name = "date_attempted")
    private Date dateAttempted;

    @Column(name = "attempts")
    private Integer attempts;

    @Column(name = "tags")
    private String tags;

    @Column(name = "gym")
    private String gym;

    public Climbs() {}

    public Climbs(String name, String grade, String location, String notes, Integer stars,
                  ClimbType type, Date dateAttempted, Integer attempts, String tags, String gym) {
        this.name = name;
        this.grade = grade;
        this.location = location;
        this.notes = notes;
        this.stars = stars;
        this.type = type;
        this.dateAttempted = dateAttempted;
        this.attempts = attempts;
        this.tags = tags;
        this.gym = gym;
    }

    // --- Getters and Setters ---
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public Integer getStars() { return stars; }
    public void setStars(Integer stars) { this.stars = stars; }

    public ClimbType getType() { return type; }
    public void setType(ClimbType type) { this.type = type; }

    public Date getDateAttempted() { return dateAttempted; }
    public void setDateAttempted(Date dateAttempted) { this.dateAttempted = dateAttempted; }

    public Integer getAttempts() { return attempts; }
    public void setAttempts(Integer attempts) { this.attempts = attempts; }

    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }

    public String getGym() { return gym; }
    public void setGym(String gym) { this.gym = gym; }
}
