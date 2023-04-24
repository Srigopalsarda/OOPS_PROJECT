package com.prog.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "USER_DTLS")

public class UserDtls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "First_Name")
    private String q45_fullName1;
    @Column(name = "Last_Name")
    private String q45_fullName2;
    private String q2_email;
    private int q42_phone;
    private String q2_password;

    public int getId() {
        return id;
    }

    public String getQ45_fullName1() {
        return q45_fullName1;
    }

    public String getQ45_fullName2() {
        return q45_fullName2;
    }

    public String getQ2_email() {
        return q2_email;
    }

    public int getQ42_phone() {
        return q42_phone;
    }

    public String getQ2_password() {
        return q2_password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQ45_fullName1(String q45_fullName1) {
        this.q45_fullName1 = q45_fullName1;
    }

    public void setQ45_fullName2(String q45_fullName2) {
        this.q45_fullName2 = q45_fullName2;
    }

    public void setQ2_email(String q2_email) {
        this.q2_email = q2_email;
    }

    public void setQ42_phone(int q42_phone) {
        this.q42_phone = q42_phone;
    }

    public void setQ2_password(String q2_password) {
        this.q2_password = q2_password;
    }

    @Override
    public String toString() {
        return "UserDtls{" +
                "id=" + id +
                ", q45_fullName1='" + q45_fullName1 + '\'' +
                ", q45_fullName2='" + q45_fullName2 + '\'' +
                ", q2_email='" + q2_email + '\'' +
                ", q42_phone=" + q42_phone +
                ", q2_password='" + q2_password + '\'' +
                '}';
    }
}
