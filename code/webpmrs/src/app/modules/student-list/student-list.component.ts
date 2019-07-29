import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StudentFields } from '../student-register/studentInterface';
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
  index=1;
  
  public list: Student;
  
  ngOnInit() {
   
  
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


  

}
