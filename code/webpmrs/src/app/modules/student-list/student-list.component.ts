import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StudentFields } from '../student-register/studentInterface';
import { Student } from 'src/app/core/models/Student';
import { Http } from '@angular/http';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  constructor(private http: Http,private commonService:CommonService) { }
  flagvar = false;
  flagTable = false;
  public StudentForm: FormGroup;
  error;
  index = 1;

  public list: Student;

  ngOnInit() {
    this.getStudentList();
  }

  baseurl = this.commonService.baseurl+"/admin/studentList";
  getStudentList() {
    this.http.get(this.baseurl).subscribe(result => {
      if (result.text() != "") {
        this.list = result.json();

      } else {
        this.error = "There is no result...";
        this.flagTable=true;
      }
    });
  }
  onUpdate(){

  }

}
