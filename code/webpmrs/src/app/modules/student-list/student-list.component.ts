import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StudentFields } from './studentInterface';
import { Student } from 'src/app/core/models/Student';
import { Http } from '@angular/http';

@Component({
  selector: 'student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  constructor(private http:Http) { }
  flagvar = false;
  flagTable = true;
  public StudentForm: FormGroup;
  error;
  
  public list: Student;
  
  ngOnInit() {
    this.StudentForm = new FormGroup(
      {
        firstname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        lastname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        email: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
        contact: new FormControl('', [Validators.required]),
        course: new FormControl('', [Validators.required])
      });
      this.getStudentList();
    }
    
  baseurl="http://localhost:7090/pmrs/admin/studentList";
  getStudentList(){
    this.http.get(this.baseurl).subscribe(result => {
      if (result.text() != "") {
        this.list = result.json();        
      } else {
        this.error = "There is no result...";
      }
    });
  }


  public hasError = (controlName: string, errorName: string) => {
    return this.StudentForm.controls[controlName].hasError(errorName);
  }

  public createRegister = (studentFormValue) => {
    if (this.StudentForm.valid) {
      this.executeFormCreation(studentFormValue);
      console.log(studentFormValue);
    }
  }

  private executeFormCreation = (studentFormValue) => {

    let fields: StudentFields = {
      firstName: studentFormValue.firstname,
      lastName: studentFormValue.lastname,
      email: studentFormValue.email,
      contact: studentFormValue.contact,
      course: studentFormValue.course
    }
  }

  AddStudent() {
    this.flagvar = true;
    this.flagTable = false;
  }

  onUpdate(s1: Student) {

  }

  onDropDownSelection(val) {
    console.log();
  }

  register() {
    this.flagTable = true;
    this.flagvar = false;
  }

}
