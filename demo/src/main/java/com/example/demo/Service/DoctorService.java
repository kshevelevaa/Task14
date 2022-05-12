package com.example.demo.Service;

import com.example.demo.Model.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    public  static List<Doctor> doctors= new ArrayList<Doctor>();

    public boolean addDoctor(Doctor doctor){
        for (Doctor doctor1: doctors){
            if (doctor1 == doctor){
                return false;
            }
        }
        return doctors.add(doctor);
    }

    public boolean deleteDoctor (int id){
        for (Doctor doctor1: doctors){
            if (doctor1.getId()==id){
                return doctors.remove(doctor1);
            }
        }
        return false;
    }

    public Doctor printDoctor(int id){
        for (Doctor doctor1: doctors){
            if (doctor1.getId() == id){
                return doctor1;
            }
        }
        return null;
    }

    public List<Doctor> printDoctors(){
        return doctors;
    }
}
