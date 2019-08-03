import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Project } from 'src/app/core/models/Project';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-mentorprojectlist',
  templateUrl: './mentorProjectlist.component.html',
  styleUrls: ['./mentorProjectlist.component.css']
})
export class MentorProjectListComponent implements OnInit {
 
  private id;
  private type;
  error:string;
  index=1; 
  flagstudentTable=false;
  flagprojectable=true;
  projectList: any;
  studentList:any;
  contentTitle;
  constructor(private http:Http ,private commonService: CommonService) { }

  ngOnInit() {
    this.getProjectList();
  }

  baseurl=this.commonService.baseurl+"/admin/projectList";
  getProjectList(){
    this.http.get(this.baseurl).subscribe(result => {
      if (result.text() != "") {
        this.contentTitle="Project List";
        this.projectList = result.json();        
      } else {
        this.error = "There is no result...";
      }
    });
  }

  onUpdate(){
    this.flagprojectable=false;
    this.flagstudentTable=true;
    this.contentTitle="Project Student List";
    this.commonService.getStudentsList(1,"mentor").subscribe(result=>{
      if(result.text()!=""){
        this.studentList=result.json();
      }else{
        this.error="There is no result......";
      }
    });
  }

}
