import { Component, OnInit } from '@angular/core';
import { projectlist } from './projectlist';
import { Student } from 'src/app/core/models/Student';


@Component({
  selector: 'app-mentordashboard',
  templateUrl: './mentordashboard.component.html',
  styleUrls: ['./mentordashboard.component.css']
})
export class MentordashboardComponent implements OnInit {

  constructor() { }
  


  flagTable=true;
  flagstudentTable=false;
  
  public list:projectlist[]=[{SNo:"1", ProjectTitle:"abcdef",ProjectDescription:"abchdfdfs",ProjectTechnology:"qweety", SoftwareRequirements:"hover",HardwareRequirements:"antlantica"},
  {SNo:"1", ProjectTitle:"abcdef",ProjectDescription:"abchdfdfs",ProjectTechnology:"qweety", SoftwareRequirements:"hover",HardwareRequirements:"antlantica"},
  {SNo:"1", ProjectTitle:"abcdef",ProjectDescription:"abchdfdfs",ProjectTechnology:"qweety", SoftwareRequirements:"hover",HardwareRequirements:"antlantica"}];



  studentview=[{ firstName:"abcdef",lastName:"abchdfdfs",email:"qweety", contact:"hover"},
  { firstName:"abcdef",lastName:"abchdfdfs",email:"qweety", contact:"hover"},
  { firstName:"abcdef",lastName:"abchdfdfs",email:"qweety", contact:"hover"}];




  ngOnInit() {
  }

  onUpdate(){

    this.flagTable=false;
     this.flagstudentTable=true;   
    
 
   }

  

}
