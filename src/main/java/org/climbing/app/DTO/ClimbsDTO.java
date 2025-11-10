package org.climbing.app.DTO;

import org.climbing.app.domain.ClimbType;

import java.util.Date;

public class ClimbsDTO {

    private Long id;
    private String name;
    private String grade;
    private String location;
    private String notes;
    private Integer stars;
    private ClimbType type; // e.g., "boulder", "sport", "trad"
    private Date dateAttempted;
    private Integer attempts;
    private String tags;
    private String gym;

    // ===== Constructors =====
    public ClimbsDTO() {
    }

    public ClimbsDTO(Long id, String name, String grade, String location, String notes,
                     Integer stars, ClimbType type, Date dateAttempted, Integer attempts,
                     String tags, String gym) {
        this.id = id;
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

    // ===== Getters and Setters =====
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

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
