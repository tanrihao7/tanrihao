package com.entiy;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Pattern;

/**
 * @date 2020/9/24 11:45
 */
public class Staff {
    private Integer staff_id;
    @Pattern(regexp="(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})"
            ,message="用户名必须是2-5位中文或者6-16位英文和数字的组合")
    private String staff_name;
    private Integer staff_age;
    private String staff_sex;
    private String staff_address;
    private Integer staff_phone;
    private String staff_password;

    public Staff(Integer staff_id, String staff_name, Integer staff_age, String staff_sex, String staff_address, Integer staff_phone, String staff_password) {
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.staff_age = staff_age;
        this.staff_sex = staff_sex;
        this.staff_address = staff_address;
        this.staff_phone = staff_phone;
        this.staff_password = staff_password;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public void setStaff_address(String staff_address) {
        this.staff_address = staff_address;
    }

    public int getStaff_Phone() {
        return staff_phone;
    }

    public void setStaff_Phone(int phone) {
        this.staff_phone = phone;
    }

    public String getStaff_password() {
        return staff_password;
    }

    public void setStaff_password(String staff_password) {
        this.staff_password = staff_password;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id=" + staff_id +
                ", staff_name='" + staff_name + '\'' +
                ", staff_age=" + staff_age +
                ", staff_sex='" + staff_sex + '\'' +
                ", staff_address='" + staff_address + '\'' +
                ", phone=" + staff_phone +
                ", staff_password='" + staff_password + '\'' +
                '}';
    }
}
