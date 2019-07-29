import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Project } from 'src/app/core/models/Project';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-MentorStudentList',
  templateUrl: './MentorStudentList.component.html',
  styleUrls: ['./MentorStudentList.component.css']
})
export class MentorStudentListComponent implements OnInit {
 
  private id;
  private type;
  list:Project;
  error:string;
  index=1; 
  flagstudentTable=true;
  projectList: any;  
  contentTitle="Student List";

  constructor(private http:Http ,private commonService: CommonService) { }

  public studentList;
  
  ngOnInit() {
    
    this.commonService.getStudentsList(1,"mentor").subscribe(result => {
      if (result.text() != "") {
        this.studentList = result.json();        
      } else {
        this.error = "There is no result...";
      }
    });
  }

  onUpdate(){
    this.flagstudentTable=true;
    this.commonService.getStudentsList(1,"mentor").subscribe(result=>{
      if(result.text()!=""){
        this.studentList=result.json();
      }else{
        this.error="There is no result......";
      }
    });
  }

}
