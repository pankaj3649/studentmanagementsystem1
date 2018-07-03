package com.example.windows.studentmanagementsystem;

public class Student {
    String collegeName;
    String userName;
    int phoneNumber;
    String address;

   public  Student(String userName,String collegeName,String address,int phoneNumber)
   {
       this.userName=userName;
       this.collegeName=collegeName;
       this.address=address;
       this.phoneNumber=phoneNumber;
   }
}
