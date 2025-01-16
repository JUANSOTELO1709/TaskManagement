package com.example.taskmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private int stages; // Nuevo campo para etapas

    // Constructor sin parámetros
    public Task() {}

    // Constructor con parámetros
    public Task(String title, String description, boolean completed, int stages) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.stages = stages;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    public int getStages() { return stages; }
    public void setStages(int stages) { this.stages = stages; }
}
