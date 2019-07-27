import { Component, OnInit } from '@angular/core';
import { Students } from './Students';

import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StudentsFields } from './studentInterface';

@Component({
  selector: 'student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  constructor() { }
  flagvar=false;
  flagTable=true;
  public StudentForm: FormGroup;

  public list:Students[]=[{FirstName:"mnhs",LastName:"Rajan",Email:"abc@gfs",Contact:"111111",Course:"DAC"},
 {FirstName:"djsd",LastName:"Rajan",Email:"abc@gfs",Contact:"111111",Course:"DAC"},
 {FirstName:"dnskn",LastName:"Rajan",Email:"abc@gfs",Contact:"111111",Course:"DAC"}];
  
 st:Students={FirstName:"",LastName:"",Email:"",Contact:"",Course:""};

 ngOnInit()
 {
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

  let fields: StudentsFields = {
    firstname: studentFormValue.firstname,
    lastname: studentFormValue.lastname,
    email: studentFormValue.email,
    contact: studentFormValue.contact,
    course: studentFormValue.course
   

  }
}
 
 
 AddStudent(){
 this.flagvar=true;
 this.flagTable=false;
 
 }

 onUpdate(s1:Students){
 


 }
 

 onDropDownSelection(val){
 
 console.log();

    }

register()
{
   this.flagTable=true;
   this.flagvar=false;
}

}
