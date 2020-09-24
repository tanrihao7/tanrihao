package com.dao;

import com.entiy.Staff;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @date 2020/9/25 0:07
 */
@Repository
public interface StaffMapper {
    public Staff getStaffById(int id);
    public void insertStaff(Staff staff);
    public void updateStaff(Staff staff);
    public void deleteUserById(int id);
    //获取所有的员工信息
    @Select("select * from staff ")
    List<Staff> getAllStaff();
}
