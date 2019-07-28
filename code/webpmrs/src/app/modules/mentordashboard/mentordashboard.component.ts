import { Component, OnInit } from '@angular/core';
import { projectlist } from './projectlist';
import { Student } from 'src/app/core/models/Student';
import { CommonService } from 'src/app/core/services/common.service';
import { Project } from 'src/app/core/models/Project';


@Component({
  selector: 'app-mentordashboard',
  templateUrl: './mentordashboard.component.html',
  styleUrls: ['./mentordashboard.component.css']
})
export class MentordashboardComponent implements OnInit {
  error: string;

  constructor(private commonService: CommonService) { }
  private id;
  private type;

  flagTable = true;
  flagstudentTable = false;

  projectList: projectlist[] = [{ SNo: "1", ProjectTitle: "abcdef", ProjectDescription: "abchdfdfs", ProjectTechnology: "qweety", SoftwareRequirements: "hover", HardwareRequirements: "antlantica" },
  { SNo: "1", ProjectTitle: "abcdef", ProjectDescription: "abchdfdfs", ProjectTechnology: "qweety", SoftwareRequirements: "hover", HardwareRequirements: "antlantica" },
  { SNo: "1", ProjectTitle: "abcdef", ProjectDescription: "abchdfdfs", ProjectTechnology: "qweety", SoftwareRequirements: "hover", HardwareRequirements: "antlantica" }];

  studentview = [{ firstName: "abcdef", lastName: "abchdfdfs", email: "qweety", contact: "hover" },
  { firstName: "abcdef", lastName: "abchdfdfs", email: "qweety", contact: "hover" },
  { firstName: "abcdef", lastName: "abchdfdfs", email: "qweety", contact: "hover" }];

  ngOnInit() {
  }

  onUpdate() {

    this.flagTable = false;
    this.flagstudentTable = true;

  }
  getStudentList() {
    this.id = {"mentorId":1};
    this.type = "mentor";
    
    this.commonService.getStudentsList(this.id, this.type).subscribe(result => {
      if(result.text() != ""){
        this.projectList=result.json();
      }else {
        this.projectList=null;
        this.error = "No data available";
      }
    });
  }


}
