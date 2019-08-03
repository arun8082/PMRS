import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StudentFields } from './studentInterface';
import { Http,Response } from '@angular/http';
import { Student } from 'src/app/core/models/Student';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-student-register',
  templateUrl: './student-register.component.html',
  styleUrls: ['./student-register.component.css']
})
export class StudentRegisterComponent implements OnInit {

  constructor(private http:Http,private commonService:CommonService) { }
  public StudentForm:FormGroup;
  baseurlStudentregister = this.commonService.baseurl+"/student/register";

  public student:Student;
  successMessage:string;

  ngOnInit() {
    this.StudentForm = new FormGroup(
      {
        firstName: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        lastName: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        email: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
        contact: new FormControl('', [Validators.required]),
        course: new FormControl('', [Validators.required])
      });
     
    
  }

  public hasError = (controlName: string, errorName: string) => {
    return this.StudentForm.controls[controlName].hasError(errorName);
  }

  public createStudent = (StudentFormValue) => {
    this.executeFormCreation(StudentFormValue);
    if (this.StudentForm.valid) {
        this.http.post(this.baseurlStudentregister, StudentFormValue).subscribe(result => {
        this.student=result.json();
        this.successMessage="Student Added Successfully";
        this.StudentForm.reset();
        console.log(this.student);
      });

      console.log("in function");
      console.log(StudentFormValue);
      
     
    }
  }
  public resetStudent = (StudentFormValue) => {
    this.StudentForm.reset();

  }
  private executeFormCreation = (StudentFormValue) => {

    let fields: StudentFields = {
      firstName: StudentFormValue.firstName,
      lastName: StudentFormValue.lastName,
      email: StudentFormValue.email,
      contact: StudentFormValue.contact,
      course: StudentFormValue.course
    }
  }



}
