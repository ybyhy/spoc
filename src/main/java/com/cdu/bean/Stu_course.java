package com.cdu.bean;

public class Stu_course {
    private Integer scId;

    private Integer stuId;

    private Integer courseId;

    public Stu_course(Integer scId, Integer stuId, Integer courseId) {
        this.scId = scId;
        this.stuId = stuId;
        this.courseId = courseId;
    }

    public Stu_course() {
        super();
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}