package com.cdu.bean;

public class Student {
    private Integer stuId;

    private String stuAccount;

    private String stuPw;

    private String stuName;

    private String stuEmail;

    private String stuPhone;

    private String stuGender;

    private String stuIcon;

    public Student(Integer stuId, String stuAccount, String stuPw, String stuName, String stuEmail, String stuPhone, String stuGender, String stuIcon) {
        this.stuId = stuId;
        this.stuAccount = stuAccount;
        this.stuPw = stuPw;
        this.stuName = stuName;
        this.stuEmail = stuEmail;
        this.stuPhone = stuPhone;
        this.stuGender = stuGender;
        this.stuIcon = stuIcon;
    }

    public Student() {
        super();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuAccount() {
        return stuAccount;
    }

    public void setStuAccount(String stuAccount) {
        this.stuAccount = stuAccount == null ? null : stuAccount.trim();
    }

    public String getStuPw() {
        return stuPw;
    }

    public void setStuPw(String stuPw) {
        this.stuPw = stuPw == null ? null : stuPw.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender == null ? null : stuGender.trim();
    }

    public String getStuIcon() {
        return stuIcon;
    }

    public void setStuIcon(String stuIcon) {
        this.stuIcon = stuIcon == null ? null : stuIcon.trim();
    }
}