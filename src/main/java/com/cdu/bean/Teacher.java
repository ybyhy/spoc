package com.cdu.bean;

public class Teacher {
    private Integer teacherId;

    private String teacherAccount;

    private String teacherPw;

    private String teacherName;

    private String teacherGender;

    private String teacherIntro;

    private String teacherIcon;

    public Teacher(Integer teacherId, String teacherAccount, String teacherPw, String teacherName, String teacherGender, String teacherIntro, String teacherIcon) {
        this.teacherId = teacherId;
        this.teacherAccount = teacherAccount;
        this.teacherPw = teacherPw;
        this.teacherName = teacherName;
        this.teacherGender = teacherGender;
        this.teacherIntro = teacherIntro;
        this.teacherIcon = teacherIcon;
    }

    public Teacher() {
        super();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount == null ? null : teacherAccount.trim();
    }

    public String getTeacherPw() {
        return teacherPw;
    }

    public void setTeacherPw(String teacherPw) {
        this.teacherPw = teacherPw == null ? null : teacherPw.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender == null ? null : teacherGender.trim();
    }

    public String getTeacherIntro() {
        return teacherIntro;
    }

    public void setTeacherIntro(String teacherIntro) {
        this.teacherIntro = teacherIntro == null ? null : teacherIntro.trim();
    }

    public String getTeacherIcon() {
        return teacherIcon;
    }

    public void setTeacherIcon(String teacherIcon) {
        this.teacherIcon = teacherIcon == null ? null : teacherIcon.trim();
    }
}