import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StudentFields } from './studentInterface';

@Component({
  selector: 'studentform',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {
 

  public StudentForm: FormGroup;


  ngOnInit() {
    this.StudentForm = new FormGroup(
      {
        firstname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        lastname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        email: new FormControl('', [Validators.required ,Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
        contact: new FormControl('', [Validators.required]),
        course: new FormControl('', [Validators.required])
       
     

      });
  }

  public hasError = (controlName: string, errorName: string) => {
    return this.StudentForm.controls[controlName].hasError(errorName);
  }

  public createRegister = (studentFormValue) => {
    if (this.StudentForm.valid) {
      this.executeFormCreation(studentFormValue);
    }
  }

  private executeFormCreation = (studentFormValue) => {

    let fields: StudentFields = {
      firstname: studentFormValue.firstname,
      lastname: studentFormValue.lastname,
      email: studentFormValue.email,
      contact: studentFormValue.contact,
      course: studentFormValue.course
     

    }
  }

}
