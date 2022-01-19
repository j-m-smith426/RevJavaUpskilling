package com.revature.handson.StudentProcessing;

import com.revature.handson.StudentProcessing.service.ProcessStudent;

public class Main {

    public static void main(String[] args) {
        ProcessStudent processStudent = new ProcessStudent();
        processStudent.process();
    }
}
