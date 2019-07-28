import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StudentFields } from './studentInterface';

@Component({
  selector: 'app-student-register',
  templateUrl: './student-register.component.html',
  styleUrls: ['./student-register.component.css']
})
export class StudentRegisterComponent implements OnInit {

  public StudentForm:FormGroup;
  baseurlStudentregister = "http://localhost:7090/pmrs/student/register";
  constructor() { }

  ngOnInit() {
    this.StudentForm = new FormGroup(
      {
        firstname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        lastname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        email: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
        contact: new FormControl('', [Validators.required]),
        course: new FormControl('', [Validators.required])
      });
     
    
  }

  public hasError = (controlName: string, errorName: string) => {
    return this.StudentForm.controls[controlName].hasError(errorName);
  }

  public createStudent = (StudentFormValue) => {
    if (this.StudentForm.valid) {
      this.executeFormCreation(StudentFormValue);
      console.log("in function");
      console.log(StudentFormValue);
      
     
    }
  }

  
  private executeFormCreation = (StudentFormValue) => {

    let fields: StudentFields = {
      firstName: StudentFormValue.firstname,
      lastName: StudentFormValue.lastname,
      email: StudentFormValue.email,
      contact: StudentFormValue.contact,
      course: StudentFormValue.course
    }
  }



}
