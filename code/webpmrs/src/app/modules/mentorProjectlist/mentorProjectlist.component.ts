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
  list:Project;
  error:string;
 
  flagstudentTable:false;
  constructor(private http:Http ,private commonService: CommonService) { }

  public projectList= [{ SNo: "1", ProjectTitle: "abcdef", ProjectDescription: "abchdfdfs", ProjectTechnology: "qweety", SoftwareRequirements: "hover", HardwareRequirements: "antlantica" },
  { SNo: "1", ProjectTitle: "abcdef", ProjectDescription: "abchdfdfs", ProjectTechnology: "qweety", SoftwareRequirements: "hover", HardwareRequirements: "antlantica" },
  { SNo: "1", ProjectTitle: "abcdef", ProjectDescription: "abchdfdfs", ProjectTechnology: "qweety", SoftwareRequirements: "hover", HardwareRequirements: "antlantica" }];

  public studentview = [{ firstName: "abcdef", lastName: "abchdfdfs", email: "qweety", contact: "hover" },
  { firstName: "abcdef", lastName: "abchdfdfs", email: "qweety", contact: "hover" },
  { firstName: "abcdef", lastName: "abchdfdfs", email: "qweety", contact: "hover" }];


  
  ngOnInit() {
    this.getProjectList();
  }

  baseurl="http://localhost:7090/pmrs/admin/projectList";
  getProjectList(){
    this.http.get(this.baseurl).subscribe(result => {
      if (result.text() != "") {
        this.list = result.json();        
      } else {
        this.error = "There is no result...";
      }
    });
  }

}
