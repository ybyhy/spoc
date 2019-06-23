package com.cdu.bean;

public class Course_content {
    private Integer contentId;

    private String unit;

    private String chapter;

    private Integer courseId;

    public Course_content(Integer contentId, String unit, String chapter, Integer courseId) {
        this.contentId = contentId;
        this.unit = unit;
        this.chapter = chapter;
        this.courseId = courseId;
    }

    public Course_content() {
        super();
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter == null ? null : chapter.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}