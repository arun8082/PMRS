/*
import { RegisterService } from 'src/app/core/services/register.service';
import { OnInit, Component } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})

export class TestComponent implements OnInit {

  studentArray=[{}];
  constructor(private pservice:RegisterService){};
  ngOnInit(){
      this.pservice.getAllStudents().subscribe((r)=>this.studentArray=r);
      //this.pservice.getResult().subscribe((r)=> this.str);
  }
}
*/

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RegisterService } from 'src/app/core/services/register.service';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent {
  baseUrl = "http://localhost:7090/pmrs/upload";
  fileData: File = null;
  studentArray=[{}];

  constructor(private http: HttpClient,private pservice:RegisterService,private loginService:CommonService) { }
  
  ngOnInit(){
    this.pservice.getAllStudents().subscribe((r)=>this.studentArray=r);
    //this.pservice.getResult().subscribe((r)=> this.str);
  }


  fileProgress(fileInput: any) {
    this.fileData = <File>fileInput.target.files[0];
  }

  onSubmit(event) {
    this.fileData = event.target.files[0]
    console.log(event.target.files);
  }

  /*upload() {
    const formData = new FormData();
    formData.append('file', this.fileData);
    this.http.post(this.baseUrl, formData)
      .subscribe(res => {
        console.log(res);
        alert('SUCCESS !!');
      })
  }*/
  upload() {
    const formData = new FormData();
    formData.append('file', this.fileData);
    console.log(this.fileData);
    this.loginService.loginCourseAdmin(formData);
  }
}
