package com.cdu.bean;

public class Course {
    private Integer courseId;

    private String courseName;

    private String courseDirection;

    private String courseLevel;

    private String courseKeywords;

    private String courseIntro;

    private String courseIcon;

    private Integer courseClickCount;

    private Integer teacherId;

    public Course(Integer courseId, String courseName, String courseDirection, String courseLevel, String courseKeywords, String courseIntro, String courseIcon, Integer courseClickCount, Integer teacherId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDirection = courseDirection;
        this.courseLevel = courseLevel;
        this.courseKeywords = courseKeywords;
        this.courseIntro = courseIntro;
        this.courseIcon = courseIcon;
        this.courseClickCount = courseClickCount;
        this.teacherId = teacherId;
    }

    public Course() {
        super();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseDirection() {
        return courseDirection;
    }

    public void setCourseDirection(String courseDirection) {
        this.courseDirection = courseDirection == null ? null : courseDirection.trim();
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel == null ? null : courseLevel.trim();
    }

    public String getCourseKeywords() {
        return courseKeywords;
    }

    public void setCourseKeywords(String courseKeywords) {
        this.courseKeywords = courseKeywords == null ? null : courseKeywords.trim();
    }

    public String getCourseIntro() {
        return courseIntro;
    }

    public void setCourseIntro(String courseIntro) {
        this.courseIntro = courseIntro == null ? null : courseIntro.trim();
    }

    public String getCourseIcon() {
        return courseIcon;
    }

    public void setCourseIcon(String courseIcon) {
        this.courseIcon = courseIcon == null ? null : courseIcon.trim();
    }

    public Integer getCourseClickCount() {
        return courseClickCount;
    }

    public void setCourseClickCount(Integer courseClickCount) {
        this.courseClickCount = courseClickCount;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}