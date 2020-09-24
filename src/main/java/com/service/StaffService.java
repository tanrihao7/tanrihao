package com.service;

import com.dao.StaffMapper;
import com.entiy.Staff;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
/**
 * @date 2020/9/25 0:15
 */
public class StaffService {
    StaffMapper staffMapper;
   public Staff getStaff(int id){
       Staff staff = staffMapper.getStaffById(id);
       return staff;
   }
   public void updateStaff(Staff staff){
       staffMapper.updateStaff(staff);
   }
   public void deleteStaff(int id){
       staffMapper.deleteUserById(id);
   }
   public void saveStaff(Staff staff){
       staffMapper.insertStaff(staff);
   }
   public List<Staff> getAll(){
       return staffMapper.getAllStaff();
   }
}
