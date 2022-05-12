package com.example.demo.Service;

import com.example.demo.Model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    public static List<Patient> patients = new ArrayList<Patient>();

    public boolean addPatient(Patient doctor) {
        for (Patient patient : patients) {
            if (patient == doctor) {
                return false;
            }
        }
        return patients.add(doctor);
    }

    public boolean deletePatient(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patients.remove(patient);
            }
        }

        return false;
    }

    public Patient printPatient(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    public List<Patient> printPatients() {
        return patients;
    }
}
